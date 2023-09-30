package com.IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test_Student {

	@Autowired
	@Qualifier("m1")//here we can directly give method name also
	Student ss; //This will create Object of Student Class
	
	@Value("${studentid}")
	int studentid;
	
	//If we did not use @Value  then it will give default value as zero(0); 
	//This value are seen on console only.
	//To give it a value using @Value Annotation we need to give it in application.property file
	//@Value Annotation always used with Global variable only
	
	@RequestMapping("name")
	public String getName() 
	{
		System.out.println("2");
		//Student ss=new Student(); //When we use @Autowire Annotation then we need not to create object
		System.out.println(studentid);
		System.out.println(ss.studid1);
		return ss.myName();
	}
	
	
}
