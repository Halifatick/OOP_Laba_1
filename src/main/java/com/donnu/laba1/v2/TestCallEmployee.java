package com.donnu.laba1.v2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCallEmployee {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("laba1v3ApplicationContext.xml");

        Employee employee = context.getBean("myEmployee", Employee.class);

        employee.callYourPet();
        employee.callYourCar();

        System.out.println(employee.getName());
        System.out.println(employee.getAge());

        context.close();
    }
}
