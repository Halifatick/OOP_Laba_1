package com.donnu.laba1.spring_introduction;

public class Person {
    private Pet pet;
    private String name;
    private int age;

    public void setPet(Pet pet) { this.pet = pet; }

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }

    public String getName() { return name; }

    public int getAge() { return age; }

    public void callYourPet() {
        System.out.println("Hey!");
        pet.say();
    }

    public Person() {

    }
}
