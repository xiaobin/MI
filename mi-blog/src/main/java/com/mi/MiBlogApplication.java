package com.mi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication
@EnableConfigurationProperties
public class MiBlogApplication {

	public static void main(String[] args) {
		System.err.println("1");
		SpringApplication.run(MiBlogApplication.class, args);
	}
}
