package com.mi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class MiPlatformCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPlatformCenterApplication.class, args);
	}
}
