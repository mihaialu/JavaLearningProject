package org.example.zooclubservice;

public abstract class Animal implements AnimalInterface {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
}
