package com.IOC;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//As this is user  class so we need to use @Component Annotation to create its object using @Autowire Annotation 
//If we use @Bean Annotation then we need to remove @Component Annotation
//Also we need to use @Qualifier Annotation to use @Bean Annotation

public class Student {

	public int studid1;
	
	public String myName() {
		
		return "Ashish";
	}
}

