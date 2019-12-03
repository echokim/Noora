package com.noora.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: Kim
 * @Date: 2019/12/2 17:53
 * @Version: 1.0
 **/

@SpringBootApplication
@ComponentScan(basePackages = {"com.noora"})
public class ApiAppliaction extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ApiAppliaction.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }
}
