package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService myFortuneService;
	
	public CricketCoach(FortuneService myFortuneService)
	{
		this.myFortuneService = myFortuneService;
	}
	
	public String getDailyWorkout() {
		
		return "runs kiye kya?";
	}

	public String getDailyFortune() {
		return this.myFortuneService.getFortune();
	}

}
