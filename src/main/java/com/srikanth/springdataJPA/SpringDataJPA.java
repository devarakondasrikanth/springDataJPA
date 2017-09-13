package com.srikanth.springdataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.srikanth.springdataJPA")
public class SpringDataJPA {

	public static void main(String[] args) {

		SpringApplication.run(SpringDataJPA.class, args);
		
	}

}