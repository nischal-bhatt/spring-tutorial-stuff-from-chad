package com.luv2code.springdemo;

public class TrackCoach implements Coach {

private FortuneService fortuneService;
	private String randomVal;
   

	public TrackCoach()
    {
    	System.out.println("creating trackcoach obj");
    }
	
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		System.out.println(randomVal);
		return "just do it: " + this.fortuneService.getFortune();
	}

	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("---inside setter method");
		System.out.println(randomVal.length());
		this.fortuneService = fortuneService;
	}

	public String getRandomVal() {
		return randomVal;
	}

	public void setRandomVal(String randomVal) {
		System.out.println("setting value for randomVal.....");
	this.randomVal = randomVal;
	}

}
