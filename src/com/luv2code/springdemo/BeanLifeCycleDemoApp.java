package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycleapplicationContext.xml");

		//retrive bean from spring container 
	   Coach coach= context.getBean("myCoach",Coach.class);
	   System.out.println(coach.getDailyWorkout());
		//close context
		context.close();
	}
}
