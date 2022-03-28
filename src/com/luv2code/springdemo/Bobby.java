package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("darl")
public class Bobby implements TeamMates {

	public String getTeamMates() {
		return "Bobby";
	}

}
