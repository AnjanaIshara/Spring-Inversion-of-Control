package com.luv2code.springdemo;

public class TrackCoach implements Coach{
    private FortuneService fortuneservice;

    public TrackCoach() {
    }

    public TrackCoach( FortuneService theFortuneService) {
        fortuneservice=theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5km";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return "Just Do it "+ fortuneservice.getFortune();
    }
}
