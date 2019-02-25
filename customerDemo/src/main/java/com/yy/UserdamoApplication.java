package com.yy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yy.dao")
public class UserdamoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserdamoApplication.class, args);
    }
}
