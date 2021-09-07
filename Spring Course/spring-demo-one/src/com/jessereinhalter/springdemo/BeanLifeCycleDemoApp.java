package com.jessereinhalter.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load the Spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext(
						"beanLifeCycle-applicationContext.xml");
		
		// retrieve beans from the Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();

	}

}
