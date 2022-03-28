package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class NewImplementationForFortuneService implements FortuneService {

	private List<String> fortunes = new ArrayList<String>();
	
	public String getFortune() {
	    fortunes.add("do your besttt");
	    fortunes.add("please do!");
	    fortunes.add("please make sure you win!");
	    fortunes.add("oh no!");
	    
	    ThreadLocalRandom tlr = ThreadLocalRandom.current();
		int randnum = tlr.nextInt(0,4);
	    
		return fortunes.get(randnum);
	    
	}

}
