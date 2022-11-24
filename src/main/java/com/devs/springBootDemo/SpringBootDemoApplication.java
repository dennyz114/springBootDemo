package com.devs.springBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * EnableAutoConfiguration -> based on dependencies will autoconfigure
 * ComponentScan -> scan folder to find Bean definitions
 * Configuration -> will allow dependency injection
 * */
@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
