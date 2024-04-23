package com.eureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cliente {
	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Employee emp1 = (Employee)context.getBean("emp1");
		
		System.out.println(emp1);
	}
}
