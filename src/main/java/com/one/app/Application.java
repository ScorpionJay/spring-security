package com.one.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @author jay
 * @since 2016年6月15日
 */
@SpringBootApplication
@ImportResource("classpath:spring-security.xml")
@ComponentScan(basePackages = { "com" })
@EnableAutoConfiguration
@PropertySource("classpath:message.properties")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	
	
}
