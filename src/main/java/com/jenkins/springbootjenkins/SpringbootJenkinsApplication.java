package com.jenkins.springbootjenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsApplication {

	
	public static final Logger log = LoggerFactory.getLogger(SpringbootJenkinsApplication.class);

	@PostConstruct
	public void init() {
		log.info("Application Started....");
	}
	
	public static void main(String[] args) {
		log.info("Application Executed....");
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

}
