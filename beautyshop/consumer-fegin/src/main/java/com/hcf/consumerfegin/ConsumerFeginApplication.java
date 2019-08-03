package com.hcf.consumerfegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class ConsumerFeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeginApplication.class, args);
    }

}
