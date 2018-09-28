package com.jll.jlleurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JllEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JllEurekaServerApplication.class, args);
    }
}
