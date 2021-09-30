package com.donnu.laba1.v2;

public class Employee {
    private Pet pet;
    private Car car;
    private String name;
    private int age;

    public void setPet(Pet pet) { this.pet = pet; }
    public void setCar(Car car) { this.car = car; }

    public void callYourCar() {
        System.out.println("Моя машина:");
        car.say();
    }
    public void callYourPet() {
        System.out.println("Моего питомца зовут:");
        pet.say();
    }

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }

    public String getName() { return name; }

    public int getAge() { return age; }

    public Employee() {

    }
}
