package ru.itis.inf403.model;

public class Bird extends Animal {
    private double wingspan;
    public Bird(String name, double wingspan) {
        super(name);
        this.wingspan = wingspan;
    }

    public Bird() {
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void chirp() {
        System.out.println("Chirp!");
    }
}
