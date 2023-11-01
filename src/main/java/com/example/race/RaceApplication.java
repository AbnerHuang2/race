package com.example.race;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.race.mapper")
public class RaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RaceApplication.class, args);
    }

}
