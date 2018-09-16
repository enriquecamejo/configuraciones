package com.demopoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoMicro1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoMicro1Application.class, args);
	}
}
