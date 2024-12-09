package ru.itis.inf403.model;

public class Cat extends Animal {
    private boolean isDomestic;
    public Cat(String name, boolean isDomestic) {
        super(name);
        this.isDomestic = isDomestic;
    }

    public Cat() {
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    public void meow() {
        System.out.println("Meow!");
    }
}
