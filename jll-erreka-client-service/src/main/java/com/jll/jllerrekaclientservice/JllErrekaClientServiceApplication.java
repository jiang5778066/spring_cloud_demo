package com.jll.jllerrekaclientservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class JllErrekaClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JllErrekaClientServiceApplication.class, args);
    }


    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String home(@RequestParam(value = "name", defaultValue = "jll") String name) {
        return "hello " + name + " ,i am from port:" + port;
    }


}
