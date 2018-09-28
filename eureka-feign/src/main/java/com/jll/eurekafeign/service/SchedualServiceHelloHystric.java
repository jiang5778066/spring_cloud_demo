package com.jll.eurekafeign.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SchedualServiceHelloHystric implements  SchedualServiceHello{

    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry, "+name;
    }
}
