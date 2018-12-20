package com.flown.eurekafeignclient.service;

import com.flown.eurekafeignclient.api.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    public String sayHello(String name){

        return eurekaClientFeign.sayHelloFormEurekaClient(name);
    }
}
