package com.hcf.providerbasicdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableEurekaClient
public class ProviderBasicdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderBasicdataApplication.class, args);
    }

}
