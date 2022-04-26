package com.hui.xiaomi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.hui.xiaomi.dao")
public class XiaomiApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaomiApplication.class, args);
    }

}
