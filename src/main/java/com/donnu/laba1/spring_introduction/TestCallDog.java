package com.donnu.laba1.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCallDog {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lectureApplicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
