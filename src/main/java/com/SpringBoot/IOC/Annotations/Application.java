package com.SpringBoot.IOC.Annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.IOC.Student;

@SpringBootApplication
@ComponentScan("com.IOC")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.err.println("All Done..........................");
	}
	
	@Bean("m1")
	Student getstudent() {
		
		System.out.println("Bean is created");
		Student ss=new Student();
		ss.studid1=101;
		return ss;
	}
	
	@Bean("m2")
	Student getstudent1() {
		
		System.out.println("Bean is created successfully");
		Student ss=new Student();
		ss.studid1=102;
		
		return ss;
	}


}
