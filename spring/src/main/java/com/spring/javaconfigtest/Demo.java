package com.spring.javaconfigtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		Student bean = context.getBean("getStudent",Student.class);
		bean.study();

	}

}
