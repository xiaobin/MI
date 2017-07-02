package com.mi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@Slf4j
public class MiCommonApplication extends SpringBootServletInitializer {


	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(MiCommonApplication.class, args);
		String[] activeProfiles = context.getEnvironment().getActiveProfiles();
		for (String profile : activeProfiles){
			log.info("String active profile:{}" ,profile);
		}
		log.info("应用程序启动完毕");
	}
}
