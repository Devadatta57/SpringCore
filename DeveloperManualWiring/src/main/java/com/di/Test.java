package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	   ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	   Developer d=(Developer)context.getBean("developerobj");
	   d.computer();

	}
}
