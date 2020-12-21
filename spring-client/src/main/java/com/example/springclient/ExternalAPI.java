package com.example.springclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ExternalAPI {

	public static void main(String[] args) {
		SpringApplication.run(ExternalAPI.class, args);
	}

}
