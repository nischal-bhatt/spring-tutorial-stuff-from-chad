package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Andy implements TeamMates {

	public String getTeamMates() {
		return "andy";
	}

}
