package com.demopoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoMicro1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoMicro1Application.class, args);
	}
	
	
}
