package com.xr.boot.service.impl;

import com.sun.org.apache.bcel.internal.Constants;
import com.sun.org.apache.bcel.internal.classfile.Constant;
import com.xr.boot.dao.system.MenusAndBigMenusMapper;
import com.xr.boot.dao.system.SyEmpMapper;
import com.xr.boot.dao.system.SyRoleMapper;
import com.xr.boot.entity.SyEmp;
import com.xr.boot.entity.SyMenus;
import com.xr.boot.entity.SyRolesMenus;
import com.xr.boot.entity.po.JwtToken;
import com.xr.boot.service.system.SyEmpService;
import com.xr.boot.util.JwtUtil;
import io.jsonwebtoken.Claims;
import io.lettuce.core.dynamic.segment.CommandSegment;
import jodd.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.asm.Advice;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


@Service
@Slf4j
public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private SyEmpService syEmpService;
    @Autowired
    private SyRoleMapper syRoleMapper;
    @Autowired
    private MenusAndBigMenusMapper menusAndBigMenusMapper;
    @Autowired
    private SyEmpMapper syEmpMapper;


    /**
     *  找它的原因是这个方法返回true
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }
    /**
     *  这一步我们根据token给的用户名，去数据库查出加密过用户密码，然后把加密后的密码和盐值一起发给shiro，让它做比对
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token =(String) authenticationToken.getCredentials();
        String claims = JwtUtil.parseJWT(token).getId().toString();
        if(StringUtil.isBlank(claims)){
            throw new AuthenticationException("token中账号为空");
        }
        SyEmp syEmp=new SyEmp();
        syEmp.setEmpNo(claims);
        SyEmp syEmpByEmpNo = syEmpMapper.findSyEmpByEmpNo(syEmp);
        if(syEmpByEmpNo==null){
            throw new AuthenticationException("该账号不存在");
        }
        //开始认证
        if(JwtUtil.parseJWT(token)!=null){
               return new SimpleAuthenticationInfo(token, token, "userRelam");
        }
        throw new AuthenticationException("Token无效");
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        String claims = JwtUtil.parseJWT(principalCollection.toString()).getId().toString();
        log.debug(claims);
        SyEmp syEmp=new SyEmp();
        syEmp.setEmpNo(claims);
        Integer syRolrBySyEmp = syRoleMapper.findSyRolrBySyEmp(claims);
        String roleName = syRoleMapper.findSyRolrById(syRolrBySyEmp);
        simpleAuthorizationInfo.addRole(roleName);
        SyRolesMenus syMenusByRoleId = menusAndBigMenusMapper.findSyMenusByRoleId(syRolrBySyEmp);
        Set<SyMenus> menuNames = syMenusByRoleId.getMenuNames();
        for (SyMenus menuName : menuNames) {
            simpleAuthorizationInfo.addStringPermission(menuName.getText());
        }
        return simpleAuthorizationInfo;
    }
}