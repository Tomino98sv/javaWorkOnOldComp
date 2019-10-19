package com.learningspring.demo;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "do it or no balls";
    }

}
