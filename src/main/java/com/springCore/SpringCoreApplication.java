package com.springCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {


		System.out.println("Hello world!!");
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		Student student= (Student) context.getBean("student1");
		System.out.println(student.toString());
		Student student1= (Student) context.getBean("student2");
		System.out.println(student1.toString());



	}

}
