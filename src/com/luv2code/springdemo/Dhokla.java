package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Dhokla implements Food {

	public String getFoodType() {
		return "this is dhokla";
	}

}
