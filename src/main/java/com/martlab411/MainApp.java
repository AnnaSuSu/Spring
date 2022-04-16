package com.martlab411;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
		HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
		obj.setMessage("安文超");
		obj.getMessage();
		obj.demo();
	}	
}