package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.example.controller"})
@SpringBootApplication
public class WinwinDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(WinwinDevApplication.class, args);
	}

}
