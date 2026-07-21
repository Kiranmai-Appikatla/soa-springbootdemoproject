package com.klef.soa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

@SpringBootApplication
public class SpringBootDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoProjectApplication.class, args);
		System.out.println("Project is running....");
	}

}
