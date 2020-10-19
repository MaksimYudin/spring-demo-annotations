package ru.yudin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Coach myCoach = context.getBean("myBaseballCoach", Coach.class);
        Coach myCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());
        context.close();
    }
}
