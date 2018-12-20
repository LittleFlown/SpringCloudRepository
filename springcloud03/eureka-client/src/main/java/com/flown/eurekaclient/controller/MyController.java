package com.flown.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my")
public class MyController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello/{helloName}")
    public String hello(@PathVariable  String helloName){

        return "I am "+helloName+","+port+" years old!";
    }
}
