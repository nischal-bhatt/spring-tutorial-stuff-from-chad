package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BaseballCoach implements Coach, DisposableBean,InitializingBean{
    
	private FortuneService fortuneService;
	
	
	
	public BaseballCoach(FortuneService myFortuneService)
	{
		System.out.println("inside constructor injection");
		this.fortuneService = myFortuneService;
	}
	
	public String getDailyWorkout()
    {
    	return "Spend 30 mins on batting practice";
    }

	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	public void init()
	{
		System.out.println("init method is being called because this is a bean that is created and its init is not explicitly stated!!");
	}
	//add an init method
	public void startupstuff(/**/)
	{
		System.out.println("starting up stuff....");
	}
	//add a destroy method
	public void ratlam()
	{
		System.out.println("destroying stuff....");
	}

	public void destroy() throws Exception {
		System.out.println("destroying prototype.... in baseball booyab");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("after properties set");
		int a = 1 + 1;
		System.out.println(a);
		
	}
	
}
