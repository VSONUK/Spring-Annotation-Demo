package com.springDemo.Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
//        read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

//         get the bean from spring container
//        Coach theCoach =context.getBean("thatSillyCoach",Coach.class);

//        default bean id tennisCoach class calss first letter in lower case
        SwimCoach theCoach =context.getBean("swimCoach", SwimCoach.class);

//        call the method on the bean

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

//        call our new swim methods ...  has the props values injected
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());

//         close the context
        context.close();


    }
}
