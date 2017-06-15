package com.srikanth.springdataJPA.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = {"com.srikanth.springdataJPA.*"})
public class SpringDataJPA {

	public static void main(String[] args) {

		SpringApplication.run(SpringDataJPA.class, args);

	}

}
