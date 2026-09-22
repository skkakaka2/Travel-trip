package com.zy.traveltrip;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class TravelTripApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelTripApplication.class, args);
        log.info("服务启动成功！");
    }
}
