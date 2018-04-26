package com.lyh.cloud.producer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by Lin Yuan huang
 * 2018/4/10 18:13
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(FallbackProvider.class);

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {

        logger.info("request two name is "+name);
        try{
            Thread.sleep(1000);
        }catch ( Exception e){
            logger.error(" hello two error",e);
        }
        return "producer: hello "+name+"，this is first message";
    }
}
