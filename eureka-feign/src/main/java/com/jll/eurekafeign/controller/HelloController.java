package com.jll.eurekafeign.controller;


import com.jll.eurekafeign.service.SchedualServiceHello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private SchedualServiceHello schedualServiceHello;

    @GetMapping(value = "callHello")
    public String sayHello(@RequestParam(value = "name") String name){
        return schedualServiceHello.sayHelloFromClientOne(name);
    }

}
