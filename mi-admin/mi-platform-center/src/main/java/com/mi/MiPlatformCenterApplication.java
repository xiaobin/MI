package com.mi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class MiPlatformCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPlatformCenterApplication.class, args);
	}
}
