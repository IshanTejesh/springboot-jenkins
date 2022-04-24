package com.jenkins.springbootjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsApplicationTests {

	public static final Logger log = LoggerFactory.getLogger(SpringbootJenkinsApplicationTests.class);

	@Test
	 contextLoads() {
		log.info("Test Case Executing....");
		log.info("Test Case Executing Second Log Statement....");
		assertEquals(true, true);
	}
	
	@BeforeEach
	void tearUp() {
		log.info("Test Case Started....");
	}
	
	@AfterEach
	void tearDown() {
		log.info("Test Case Ended....");
	}

}
