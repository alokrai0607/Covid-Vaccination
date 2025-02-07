package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


// Enable Auto Configuration and component Scan
@SpringBootApplication

//Indicates that Swagger support should be enabled. 
@EnableSwagger2
public class CovidVaccinationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidVaccinationApplication.class, args);
	}

}
