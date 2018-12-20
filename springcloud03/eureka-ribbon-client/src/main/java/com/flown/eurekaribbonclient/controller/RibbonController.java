package com.flown.eurekaribbonclient.controller;

import com.flown.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name){

        return ribbonService.hello(name);
    }
}
