package com.flown.eurekafeignclient.utill;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

@Configuration
public class FeignConfig {

    @Bean
    public Retryer feignRetryer(){

        // 重试间隔为100毫秒，最大重试时间为1秒，重试次数为5次
        return new Retryer.Default(100,SECONDS.toMillis(1),5);
    }
}
