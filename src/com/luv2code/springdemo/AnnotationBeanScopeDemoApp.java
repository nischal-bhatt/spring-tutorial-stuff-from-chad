package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
   public static void main(String[] args)
   {
	   // load spring config file
	   ClassPathXmlApplicationContext context
	   = new ClassPathXmlApplicationContext("applicationContext.xml");
	   // retrieve bean from spring container
	   
	   Coach coach = context.getBean("tennisCoach",Coach.class);
	   Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
	   
	   boolean isSame = coach == alphaCoach;
	   
	   System.out.println(isSame);
	   // 
	   
	   context.close();
   }
}
