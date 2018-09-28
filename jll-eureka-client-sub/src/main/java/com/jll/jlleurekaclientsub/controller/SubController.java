package com.jll.jlleurekaclientsub.controller;

import com.jll.jlleurekaclientsub.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class SubController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "callHello")
    public String callHello(@RequestParam String name){
        return helloService.hiService(name);
    }
}
