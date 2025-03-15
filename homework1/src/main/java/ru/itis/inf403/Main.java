package ru.itis.inf403;

public class Main {
    public static void main(String[] args) {
        Animal mainAnimal = new Animal("Main animal",10);
        mainAnimal.makeSound();

        Dog myDog = new Dog("Bobik",4,false);
        myDog.makeSound();
        myDog.training();

        Cat myCat = new Cat("Persik",7,false);
        myCat.makeSound();
        myCat.tame();

        Bird myBird = new Bird("Kesha", 3,2.4f,200);
        myBird.makeSound();
        myBird.heightIncrease();

        GoldenRetriever retriever = new GoldenRetriever("SunShine",2,false);
        retriever.makeSound();
        retriever.training();
        retriever.fetch();

        GermanShepherd shepherd = new GermanShepherd("Rex",6,false);
        shepherd.makeSound();
        shepherd.training();
        shepherd.guard();
    }
}