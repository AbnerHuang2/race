package com.example.race.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author skitii
 * @since 2023/11/01
 **/
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }
}
