package com.hcf.consumerfegin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider-basicdata")
public interface HelloService {
    @RequestMapping("hello/{name}")
    public String hello(@PathVariable("name") String name);
}
