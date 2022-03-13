package com.likewater.mall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot Starter
 *
 * @author likewater
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.likewater.mall.user","com.alibaba.cola"})
@MapperScan("com.likewater.mall.user.**.mapper.**")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
