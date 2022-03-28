package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	public TennisCoach()
	{
		System.out.println("creating tennis coach");
	}
	
	public String getDailyWorkout() {
		return "hehe rinkiya ke papa";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@PostConstruct
	public void initializing()
	{
		System.out.println("creating tennis!!!");
	}
	
	@PreDestroy
	public void predestroy()
	{
		System.out.println("destroying tennis!!!");
	    System.out.println("something happening///");
	}

}
