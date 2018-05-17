package com.lyh.cloud.producer.controller;

import com.lyh.cloud.producer.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by Lin Yuan huang
 * 2018/4/10 18:13
 */
@RestController
@RefreshScope
public class ConsumerController {
    @Autowired
    HelloRemote helloRemote;
    @Value("${hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {

        return helloRemote.hello(name);
    }
}
