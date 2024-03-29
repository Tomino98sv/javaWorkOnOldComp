package com.learningspring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach baseballCoach = (Coach) context.getBean("myTrackCoach");

        System.out.println(baseballCoach.getDailyWorkout());
    }

}
