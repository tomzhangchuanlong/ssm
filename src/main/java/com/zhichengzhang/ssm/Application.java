package com.zhichengzhang.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@MapperScan("com.zhichengzhang.ssm.mapper")
public class Application {

    public static void main(String[] args) {
        System.out.println("Hello ssm");
        SpringApplication.run(Application.class,args);
    }

}