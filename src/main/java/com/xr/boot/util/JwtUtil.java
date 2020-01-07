package com.xr.boot.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * jwt工具类用于生成和解析jwt
 */
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
     * @param subject
     * @param roles
     * @return
     */
    public static String createJwt(String id,String subject,String roles){
        long nowMillis=System.currentTimeMillis();
        Date now=new Date(nowMillis);
        JwtBuilder builder = Jwts.builder().setId("430681")//用户ID
                .setSubject(subject)//用户名
                .claim("user",roles)//存入一个自定义属性
                .setIssuedAt(now)//生成时间
                .signWith(SignatureAlgorithm.HS256, key)//前面算法，这里采用HS256加密算法盐值是java
                .setExpiration(new Date(new Date().getTime()+60000*2));//失效时间(毫秒为单位)这里是2分钟超过时间抛出io.jsonwebtoken
        return builder.compact();
    }

    /**
     * 解析Token
     * @param jwtstr Token
     * @return
     */
    public static Claims parseJWT(String jwtstr){
        return Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(jwtstr)
                .getBody();
    }
}
