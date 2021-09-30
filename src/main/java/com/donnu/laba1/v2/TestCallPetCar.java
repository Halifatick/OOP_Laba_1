package com.donnu.laba1.v2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCallPetCar {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("laba1v2ApplicationContext.xml");

        com.donnu.laba1.v2.Pet pet = context.getBean("myPet", Pet.class);
        com.donnu.laba1.v2.Car car = context.getBean("myCar", Car.class);
        pet.say();
        car.say();

        context.close();
    }
}
