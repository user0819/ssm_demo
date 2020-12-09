package com.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.wang.mapper"})
@SpringBootApplication
public class SsmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmDemoApplication.class, args);
    }

}
