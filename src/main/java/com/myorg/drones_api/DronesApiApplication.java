package com.myorg.drones_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DronesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DronesApiApplication.class, args);
		System.out.println("Launched Successfully");
	}

}
