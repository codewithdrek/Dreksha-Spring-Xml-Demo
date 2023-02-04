//package com.luv2code.springdemo;
//
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class MyApp  {
//	public static void main(String[] args) {
//		
//		ClassPathXmlApplicationContext applicationContext = 
//				new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		coach coach = applicationContext.getBean("myCoach",coach.class);
//		System.out.println(coach.getDailyWorkout());
//		System.out.println(coach.getDailyFortune());
//		
//		applicationContext.close();
//		
//		//coach baseballCoach = new BaseballCoach();
//		//System.out.println(baseballCoach.getDailyWorkout());
//	}
//}
