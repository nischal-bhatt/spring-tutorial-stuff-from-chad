package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("randi")
public class RandiFortuneService implements FortuneService {

	@Value("${one}")
	private String firstFortune;
	@Value("${two}")
	private String secondFortune;
	@Value("${three}")
	private String thirdFortune;
	
	
	public String getFortune() {
		List<String> strings = new ArrayList<String>();
		strings.add(firstFortune);
		strings.add(secondFortune);
		strings.add(thirdFortune);
		
		Random rand = new Random();
		int i = rand.nextInt(3);
		
		return strings.get(i);
	}

}
