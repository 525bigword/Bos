package com.xr.boot.util;

import com.xr.boot.entity.SyEmp;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {
    private static String key;
    private static long ttl;

    public static String getKey() {
        return key;
    }

    public static void setKey(String key) {
        JwtUtil.key = key;
    }

    public static long getTtl() {
        return ttl;
    }

    public static void setTtl(long ttl) {
        JwtUtil.ttl = ttl;
    }

    /**
     * 生成Token
     * @param id
     * @param subject   用户名
     * @param roles     角色
     * @return
     */
    public static String createJwt(String id,String subject,String roles){
        long nowMillis=System.currentTimeMillis();
        Date now=new Date(nowMillis);
        JwtBuilder builder = Jwts.builder().setId(id)//用户ID
                .setSubject(subject)//用户名
                .setIssuedAt(now)//生成时间
                .signWith(SignatureAlgorithm.HS256, key)//前面算法，这里采用HS256加密算法盐值是java
                .setExpiration(new Date(new Date().getTime()+60000));//失效时间(毫秒为单位)这里是一分钟超过时间抛出io.jsonwebtoken
        return builder.compact();
    }
    /**
     * 生成存放了登录信息的Token
     * @param id
     * @param subject   用户名
     * @param roles     角色
     * @param syEmp    客户实体
     * @return
     */
    public static String createJwt(String id, String subject, String roles, SyEmp syEmp){
        long nowMillis=System.currentTimeMillis();
        Date now=new Date(nowMillis);
        JwtBuilder builder = Jwts.builder().setId(id)//用户ID
                .setSubject(subject)//用户名
                .setIssuedAt(now)//生成时间
                .claim("syemp",syEmp)
                .signWith(SignatureAlgorithm.HS256, key)//前面算法，这里采用HS256加密算法盐值是java
                .setExpiration(new Date(new Date().getTime()+60000));//失效时间(毫秒为单位)这里是一分钟超过时间抛出io.jsonwebtoken
        return builder.compact();
    }



    /**
     * 解析Token
     * @param jwtstr Token
     * @return
     */
    public static Claims parseJWT(String jwtstr){
        Claims body=null;
        try {
            body = Jwts.parser()
                    .setSigningKey(key)
                    .parseClaimsJws(jwtstr)
                    .getBody();
        }catch (Exception e){
            return null;
        }
        return body;
    }
}
