package com.donnu.laba1.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCallPerson {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lectureApplicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);

        person.callYourPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
