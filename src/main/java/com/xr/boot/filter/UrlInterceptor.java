package com.xr.boot.filter;

import com.xr.boot.ienum.StausEnum;
import com.xr.boot.util.JwtUtil;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class UrlInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(
      HttpServletRequest request, HttpServletResponse response, Object handler) {
    String authorization = request.getHeader("Authorization");
    // 不打印健康检查接口的日志
    if(authorization==null){
      throw new RuntimeException("权限不足"+ StausEnum.NO_HANDLER);
    }else if(!authorization.startsWith("bos")){
      throw new RuntimeException("权限不足"+StausEnum.HANDLER_EXCEPTION);
    }
    String token=authorization.substring(3);
    Claims claims = JwtUtil.parseJWT(token);
    if(claims==null||"".equals(claims)){
      throw new RuntimeException("权限不足"+StausEnum.PERMISSIONS_EXCEPTION);
    }
    return true;
  }
}
