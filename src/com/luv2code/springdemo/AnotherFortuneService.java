package com.luv2code.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("another")
@Scope("singleton")
public class AnotherFortuneService implements FortuneService {

	public String getFortune() {
		return "another 1 more .. haiz";
	}

}
