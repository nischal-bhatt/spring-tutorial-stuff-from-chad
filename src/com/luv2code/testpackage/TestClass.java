package com.luv2code.testpackage;

import org.springframework.beans.factory.annotation.Value;

public class TestClass {
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;

	public String helloworld() {
		return "o" + " " + this.team + " " + this.email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}
