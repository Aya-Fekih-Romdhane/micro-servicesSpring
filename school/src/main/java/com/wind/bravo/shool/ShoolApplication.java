package com.wind.bravo.shool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ShoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoolApplication.class, args);
	}

}
