package com.hcf.basicdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BasicdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicdataApplication.class, args);
    }

}
