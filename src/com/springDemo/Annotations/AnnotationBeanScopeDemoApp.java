package com.springDemo.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach theAlpha = context.getBean("tennisCoach", Coach.class);

        // check if they are the same
        boolean result =  (theAlpha == theCoach);
        // print out the result
        System.out.println("\npointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for theAlpha :" + theAlpha);

        // close the context
        context.close();
    }
}
