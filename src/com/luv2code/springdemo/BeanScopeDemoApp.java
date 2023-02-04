package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		//retrive bean from spring container 
		
		Coach coach1 = context.getBean("myCoach",Coach.class);
		Coach coach2 = context.getBean("myCoach",Coach.class);
		boolean result = coach1 == coach2;
		System.out.println("Pointing to same object "+"  "+result);
		System.out.println("memory address for obj 1"+"  "+coach1);
		System.out.println("memory address for obj 2"+" "+coach2);
					
		//close context
		context.close();
	}
}
