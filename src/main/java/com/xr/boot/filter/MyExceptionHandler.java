package com.xr.boot.filter;


import com.xr.boot.ienum.StausEnum;
import com.xr.boot.util.JwtUtil;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * 安全拦截器类
 * 识别jwt token码
 */
@Component
@Slf4j
public class MyExceptionHandler extends HandlerInterceptorAdapter {
    @Autowired
    private JwtUtil jwtUtil;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截");
        String authorization = request.getHeader("Authorization");
        if(authorization==null){
            log.info(new Date()+"无登录状态的非法访问");
            throw new RuntimeException("权限不足"+ StausEnum.NO_HANDLER);
        }
        if(!authorization.startsWith("Bearer ")){
            log.info(new Date()+"登录状态非法");
            throw new RuntimeException("权限不足"+ StausEnum.HANDLER_EXCEPTION);
        }
        String token=authorization.substring(7);
        Claims claims = JwtUtil.parseJWT(token);
        if(claims==null||"".equals(claims)){
            log.info(new Date()+"登录状态错误");
            throw new RuntimeException("权限不足"+StausEnum.PERMISSIONS_EXCEPTION);
        }
        return true;
    }

}