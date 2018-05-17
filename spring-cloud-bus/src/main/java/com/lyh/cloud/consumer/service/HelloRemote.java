package com.lyh.cloud.producer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * create by Lin Yuan huang
 * 2018/4/11 10:10
 */
@FeignClient(name= "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
