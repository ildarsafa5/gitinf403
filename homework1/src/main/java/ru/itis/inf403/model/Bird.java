package ru.itis.inf403.model;

public class Bird extends Animal {
    protected double wingspan;
    protected double height;
    public Bird(String name, int age, double wingspan, double height) {
        super(name,age);
        this.wingspan = wingspan;
        this.height = height;
    }

    public Bird() {
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void makeSound() {
        System.out.println("Chirp!");
    }

    public void heightIncrease() {
        height+=100;
    }

}
