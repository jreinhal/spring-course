package com.jessereinhalter.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve beans from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same object
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object: " + result);
				
		// close context
		context.close();
		
		

	}

}
