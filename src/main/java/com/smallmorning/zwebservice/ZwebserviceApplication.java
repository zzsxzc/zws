package com.smallmorning.zwebservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value="com.smallmorning.zwebservice.dao")
@SpringBootApplication
public class ZwebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZwebserviceApplication.class, args);
    }

}
