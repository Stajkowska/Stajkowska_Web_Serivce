package com.stajkowska.rest.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.stajkowska.rest.task")
public class StajkowskaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(StajkowskaRestApplication.class, args);
	}

}
