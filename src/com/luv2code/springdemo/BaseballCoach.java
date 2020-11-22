package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
    //define a private field
    private FortuneService fortuneservice;
    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneservice=theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use my fortune service to get a fortune
        return fortuneservice.getFortune();
    }
}
