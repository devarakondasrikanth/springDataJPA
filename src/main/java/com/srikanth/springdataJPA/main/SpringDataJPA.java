package com.srikanth.springdataJPA.main;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.srikanth.springdataJPA.contoller,com.srikanth.springdataJPA.services,com.srikanth.springdataJPA.repo,com.srikanth.springdataJPA.pojo")
public class SpringDataJPA {

	public static void main(String[] args) {

		SpringApplication.run(SpringDataJPA.class, args);

	}

}
