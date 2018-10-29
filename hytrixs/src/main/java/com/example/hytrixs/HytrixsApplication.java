package com.example.hytrixs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableTurbineStream
@EnableHystrixDashboard
@EnableDiscoveryClient
@EnableZipkinServer
public class HytrixsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HytrixsApplication.class, args);
    }
}
