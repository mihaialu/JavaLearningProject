package org.example.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal cat001 = new Cat(name:"Jesica", age:5);
        Dog dog1 = new Dog(name:"Rex", age:12);
        Lion lion001 = new Lion(nameOfTheLion:"Simba", age:25);

        System.out.println(lion001.getAge());
        lion001.makeSound();
        cat001.makeSound();
        System.out.println(cat001.getName());
    }
}
