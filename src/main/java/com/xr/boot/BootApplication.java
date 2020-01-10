package com.xr.boot;

import com.xr.boot.util.JwtUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = JtaAutoConfiguration.class)
@EnableTransactionManagement
@MapperScan("com.xr.boot.dao")
//@EnableSwagger2
public class BootApplication {

    public static void main(String[] args) {
        JwtUtil.setKey("java");
        JwtUtil.setTtl(60000);
        SpringApplication.run(BootApplication.class, args);
    }

}
