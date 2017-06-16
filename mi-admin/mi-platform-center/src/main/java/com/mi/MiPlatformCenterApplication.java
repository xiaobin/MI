package com.mi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class MiPlatformCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPlatformCenterApplication.class, args);
	}
}
