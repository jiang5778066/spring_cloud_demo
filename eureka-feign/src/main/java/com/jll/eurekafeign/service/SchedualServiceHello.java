package com.jll.eurekafeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "jiangll-eureka-client-service",fallback = SchedualServiceHelloHystric.class)
public interface SchedualServiceHello {

    @GetMapping(value = "hello")
    public String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
