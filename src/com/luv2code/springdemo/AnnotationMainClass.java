package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMainClass {
   public static void main(String[] args)
   {
	   //read spring config file
	   
	   ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("annotation.xml");
	   
	   // get the bean from spring container
	   
	   Pasta food = context.getBean("thisisPasta",Pasta.class);
	   //default bean name
	   Food food1 = context.getBean("dhokla",Dhokla.class);
	  
	   // call a method on the bean
	   
	   System.out.println(food.getFortuneLA());
	   System.out.println(food.getFoodType());
	   System.out.println("~hey~");
	   System.out.println(food.getConcreteClass());
	  food.doSomethingWithFieldInjection();
	  System.out.println(food.returnTeamMate());
	  System.out.println(food.getJalebi());
	  System.out.println(food.returnRandi());
	   //even though u r not doing any explicit call to doSomeCrazyStuff
	   //spring is using it for dependency injection
	   
	   // close the context
	   context.close();
   }
}


/*
 * which type of injection should u use?
 * 1.constructor
 * 2.setter
 * 3.field
 * 
 * choose 1 and make use 
*/