package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		/*//load the spring config file
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("myCoach",Coach.class);
		TrackCoach coach2 = context.getBean("myCoach2",TrackCoach.class);
		Coach coach3 = context.getBean("myCoach3",Coach.class);
		//Coach coach3 = context.getBean("myCoach3",Coach.class);
		System.out.println("-----starting printing from main -----");
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		
		System.out.println("****random coming up****");
		System.out.println(coach2.getDailyFortune());
		System.out.println(coach2.getDailyWorkout());
		System.out.println(" he he he he "+coach2.getRandomVal());
		
		
		System.out.println(coach3.getDailyFortune());
		System.out.println(coach3.getDailyWorkout());
		context.close();
		
		
		//retrieve bean from spring container 
		
		//call methods on the bean 
		
		//close the container 
        //source code no need to change.. coz eeverything is being changed in config file
		*/
		/*
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		NewClassForBeanScope bean = context.getBean("scopingTest",NewClassForBeanScope.class);
		//singleton - spring creates only 1 instance of that bean
		System.out.println(bean.scopeTest());
		
		NewClassForBeanScope bean2 = context.getBean("scopingTest",NewClassForBeanScope.class);
		
		System.out.println(bean2.scopeTest());
	    */
		/*
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
		Coach coach = context.getBean("myCoach",Coach.class);
		//Coach anotherCoach = context.getBean("myCoach",Coach.class);
		//boolean result = (coach == anotherCoach);
		//System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for the coach: " + coach);
		//System.out.println("\nMemory location for the coach: " + anotherCoach);
		context.close();*/
	}

}
