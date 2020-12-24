package com.lianxi.drugs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lianxi.drugs.dao")
public class DrugsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrugsApplication.class, args);
    }

}
