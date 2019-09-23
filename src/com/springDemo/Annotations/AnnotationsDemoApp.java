package com.springDemo.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {
    public static void main(String[] args) {
//        read spring config file

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

//         get the bean from spring container
//        Coach theCoach =context.getBean("thatSillyCoach",Coach.class);

//        default bean id tennisCoach class calss first letter in lower case
        Coach theCoach =context.getBean("tennisCoach",Coach.class);

//        call the method on the bean

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
//         close the context
        context.close();


    }
}
