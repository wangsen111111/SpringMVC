package com.wang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @GetMapping("/t1")
    public String test(){
        System.out.println("ControllerTest--》执行了");
        return "OK";
    }
}
