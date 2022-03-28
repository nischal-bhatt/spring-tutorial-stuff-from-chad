package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.luv2code.testpackage.TestClass;

@Configuration
@PropertySource("classpath:namevalue.properties")
public class SportsConfig {
    
	
	
	@Bean
	public TestClass classgetter()
	{
		TestClass a = new TestClass();
		return a;
	}
}
