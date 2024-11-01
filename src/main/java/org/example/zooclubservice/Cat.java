package org.example.zooclubservice;

public class Cat extends Animal{

    public Cat(String name, int age){
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("Fish food - neam neam");
    }


    @Override
    public String getName() {
        return "BlaBla Bla Bla";
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
