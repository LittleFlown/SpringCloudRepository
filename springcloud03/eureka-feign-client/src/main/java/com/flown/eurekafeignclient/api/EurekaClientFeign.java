package com.flown.eurekafeignclient.api;

import com.flown.eurekafeignclient.utill.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client",configuration = FeignConfig.class)
public interface EurekaClientFeign {

    @RequestMapping(value = "/my/hello/{name}", method = RequestMethod.GET)
    public String sayHelloFormEurekaClient(@PathVariable("name") String name);
}
