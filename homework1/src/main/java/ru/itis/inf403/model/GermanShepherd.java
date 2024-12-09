package ru.itis.inf403.model;

public class GermanShepherd extends Dog {
    public GermanShepherd(String name) {
        super(name);
    }

    public GermanShepherd() {
    }

    public void guard() {
        System.out.println("Guarding!");
    }
}
