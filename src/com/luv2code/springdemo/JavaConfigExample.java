package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.testpackage.BooyakaBooyaka;
import com.luv2code.testpackage.TestClass;
import com.luv2code.testpackage.simpleAnnoBean;

public class JavaConfigExample {

	public static void main(String[] args) {
		
		//AnnotationConfigApplicationContext context 
		//= new AnnotationConfigApplicationContext(SportsConfig.class);
	
		
		AnnotationConfigApplicationContext context 
		= new AnnotationConfigApplicationContext(SportsConfig.class);
		
		TestClass ard = context.getBean("classgetter",TestClass.class);
		
		System.out.println(ard.helloworld());
		
		//simpleAnnoBean thecoach = context.getBean("somerandomname",simpleAnnoBean.class);
		//BooyakaBooyaka thecoach2 = context.getBean("nayak",BooyakaBooyaka.class);
		//System.out.println(thecoach.booya());
		//System.out.println(thecoach2.booya());
	
	}

}
