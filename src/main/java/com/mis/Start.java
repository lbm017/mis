package com.mis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lbm on 2018/4/3.
 */
@SpringBootApplication
public class Start {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Start.class, args);
    }
}
