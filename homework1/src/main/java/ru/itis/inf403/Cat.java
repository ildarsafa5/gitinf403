package ru.itis.inf403;

public class Cat extends Animal {
    protected boolean isDomestic;
    public Cat(String name,int age, boolean isDomestic) {
        super(name,age);
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

    public void makeSound() {
        System.out.println("Meow!");
    }

    public void tame() {
        isDomestic = true;
    }
}
