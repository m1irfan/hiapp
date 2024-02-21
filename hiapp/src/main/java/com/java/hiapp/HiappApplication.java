package com.java.hiapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.java.hiapp","com.java.hiapp.dao"})
@EnableAutoConfiguration
public class HiappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiappApplication.class, args);
	}

}