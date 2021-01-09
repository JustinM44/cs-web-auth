package com.justinmechanye.CaseStudywebauthservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication @ComponentScan({"Controllers"})
public class CaseStudyWebAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaseStudyWebAuthServiceApplication.class, args);
	}

}
