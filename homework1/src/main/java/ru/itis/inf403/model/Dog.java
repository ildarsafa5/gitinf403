package ru.itis.inf403.model;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }

    public void bark() {
        System.out.println("Woof!");
    }
}