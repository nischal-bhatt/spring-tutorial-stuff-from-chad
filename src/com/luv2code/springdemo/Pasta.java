package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("thisisPasta")
public class Pasta implements Food {

	@Value("${foo}")
	private String jalebi;
	
	public String getJalebi() {
		return jalebi;
	}

	public void setJalebi(String jalebi) {
		this.jalebi = jalebi;
	}

	@Autowired
	//@Qualifier("darl")
	@Qualifier("andy")
	TeamMates teamMate;
	@Autowired
	FieldInjectionClass fieldInjectionClass;
	FortuneService happyFortuneService;
	AnewConcreteClass anewConcreteClass;
	//if a name in the constructor matches the bean name (with lower case)
	// then no need qualifier
	
   @Autowired
	public Pasta(@Qualifier("randi") FortuneService happyFortuneService) {
		
		this.happyFortuneService = happyFortuneService;
	}

	public String getFoodType() {
		return "this is italian food";
	}
	
	public String getFortuneLA()
	{
		return happyFortuneService.getFortune();
	}
	
	public String getConcreteClass()
	{
		return this.anewConcreteClass.getterd();
	}

	
    @Autowired
	public void setAnewConcreteClass(AnewConcreteClass anewConcreteClass) {
		System.out.println("inside normal getter...getter? no getter but SETTER class");
    	this.anewConcreteClass = anewConcreteClass;
	}

    @Autowired
    public String doSomeCrazyStuff(AnewConcreteClass anewConcreteClass) {
    	this.anewConcreteClass = anewConcreteClass;
    	System.out.println("autowiring.... LA");
    	return this.anewConcreteClass.getterd() + " here now ";
    }
    
    
    public void doSomethingWithFieldInjection()
    {
    	System.out.println(this.fieldInjectionClass.getFieldInjector());
    }
    
    public String returnTeamMate()
    {
    	return this.teamMate.getTeamMates();
    }
    
    public String returnRandi()
    {
    	return this.happyFortuneService.getFortune();
    }
}
