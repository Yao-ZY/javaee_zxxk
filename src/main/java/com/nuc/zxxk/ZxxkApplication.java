package com.nuc.zxxk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.nuc.zxxk.mapper")
public class ZxxkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZxxkApplication.class, args);
    }

}
