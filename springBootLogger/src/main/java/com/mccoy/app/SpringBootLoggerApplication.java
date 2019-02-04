package com.mccoy.app;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class SpringBootLoggerApplication {
private static final org.slf4j.Logger logger=LoggerFactory.getLogger(SpringBootLoggerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggerApplication.class, args);
	logger.error("This  is error log");
	logger.warn("This  is warn log");
	logger.info("This is info log");
	logger.debug("This is debug log");
	
	
	}
	@RequestMapping(value="/hello")
	public String helloMessege(){
		return "welcome to logger";
	}
	
	

}

