package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SaddFortuneService implements FortuneService {

	public String getFortune() {
		return "sad :(";
	}

}
