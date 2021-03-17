package com.bb.testPTApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling	
public class TestPtAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestPtAppApplication.class, args);
	}

}
