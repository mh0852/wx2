package com.mh.wx2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.mh.wx2.mapper")
public class Wx2Application {

    public static void main(String[] args) {
        SpringApplication.run(Wx2Application.class, args);
    }

}
