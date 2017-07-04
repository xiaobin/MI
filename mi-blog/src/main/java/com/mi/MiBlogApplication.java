package com.mi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MiBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiBlogApplication.class, args);
	}
}
