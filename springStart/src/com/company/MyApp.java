package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        // write your code here
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach baseballCoach = (Coach) context.getBean("myTrackCoach");


        System.out.println(baseballCoach.getDailyWorkout());


    }

}
