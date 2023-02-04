package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
	
		//load the spring configuration file
		ClassPathXmlApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
	
	//Retrive the bean from spring container
		CricketCoach cricketCoach = applicationContext.getBean("myCricketCoach",CricketCoach.class);
	
	//call methods on the bean
	  // System.out.print(cricketCoach.getDailyFortune());
	   //System.out.print(cricketCoach.getDailyWorkout());
	   
	   
	   //call literal values
	   System.out.print(cricketCoach.getEmailAddress());

	   System.out.print(cricketCoach.getTeam());
		
	//close the context
	applicationContext.close();
	
	}
}
