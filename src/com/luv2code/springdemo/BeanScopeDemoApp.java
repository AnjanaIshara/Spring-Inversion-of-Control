package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        // retrieve bean from spring container
        Coach theCoach=context.getBean("myCoach",Coach.class);
        Coach alphaCoach=context.getBean("myCoach",Coach.class);
        //checking the beans are the same
        boolean results=(theCoach==alphaCoach);
        System.out.println("Pointing to the same object "+results);
        System.out.println("\nMemory Location for the coach "+theCoach);
        System.out.println("\nMemory Location for alpha coach "+alphaCoach+"\n");

    }
}
