package com.qupeng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GoodsApplication9200 {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication9200.class, args);
    }

}
