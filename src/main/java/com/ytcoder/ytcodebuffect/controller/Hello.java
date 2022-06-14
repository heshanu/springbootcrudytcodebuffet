package com.ytcoder.ytcodebuffect.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/user")
public class Hello {
    @GetMapping
    public String hello() {
        return "welcome123";
    }

    @GetMapping(path = "/m")
    public void m(){
        System.out.println("mmmaaa");
    }



}
