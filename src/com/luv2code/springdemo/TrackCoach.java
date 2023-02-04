package com.luv2code.springdemo;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Workout for 3 hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	//init method
	public void doMyStartUpStuff() {
		System.out.println("init stuff");
	}
	//destroyed
	public void doDestroyStuff() {
		System.out.println("destroy stuff");
	}
}
