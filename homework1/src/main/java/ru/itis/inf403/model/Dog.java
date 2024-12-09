package ru.itis.inf403.model;

public class Dog extends Animal {
    protected boolean isTrained;
    public Dog(String name, int age, boolean isTrained) {
        super(name,age);
        this.isTrained = isTrained;
    }

    public Dog() {
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public void makeSound() {
        System.out.println("Woof!");
    }

    public void training() {
        isTrained = true;
    }
}