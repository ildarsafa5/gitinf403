package ru.itis.inf403;

import ru.itis.inf403.model.*;

public class Main {
    public static void main(String[] args) {
        Animal mainAnimal = new Animal("Main animal");
        mainAnimal.makeSound();

        Dog myDog = new Dog("Bobik");
        myDog.bark();

        Cat myCat = new Cat("Persik",true);
        myCat.meow();

        Bird myBird = new Bird("Kesha", 2.4f);
        myBird.chirp();

        GoldenRetriever retriever = new GoldenRetriever("SunShine");
        retriever.fetch();

        GermanShepherd shepherd = new GermanShepherd("Rex");
        shepherd.guard();
    }
}