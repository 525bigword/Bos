package com.xr.boot.config;

import com.xr.boot.filter.MyExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 拦截器配置类
 */
@Configuration
public class Interceptor extends WebMvcConfigurationSupport {
    @Autowired
    private MyExceptionHandler myExceptionHandler;
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myExceptionHandler).excludePathPatterns("/**");
                /*.addPathPatterns("/**")
                .excludePathPatterns("/**")*/
    }
}
