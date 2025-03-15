package ru.itis.inf403;

public class GermanShepherd extends Dog {
    public GermanShepherd(String name, int age, boolean isTrained) {
        super(name,age,isTrained);
    }

    public GermanShepherd() {
    }

    public void guard() {
        System.out.println("Guarding!");
    }
}
