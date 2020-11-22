package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneservice;
    // add new fields for email address and team
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach:setEmail address");

        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach:set Team name");

        this.team = team;
    }

    public CricketCoach() {
        System.out.println("CricketCoach:Inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneservice) {
        System.out.println("CricketCoach:Inside the setter method");
        this.fortuneservice = fortuneservice;

    }

    @Override
    public String getDailyWorkout() {
        return "Try to rotate the sides";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return fortuneservice.getFortune();
    }
}
