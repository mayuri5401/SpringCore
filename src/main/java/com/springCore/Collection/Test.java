package com.springCore.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("config_1.xml");
       Emp emp1= (Emp) context.getBean("emp1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getEmpId());
        System.out.println(emp1.getAdd());
        System.out.println(emp1.getMob());
        System.out.println(emp1.getCourse());
    }
}
