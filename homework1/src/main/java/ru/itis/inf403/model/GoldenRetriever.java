package ru.itis.inf403.model;

public class GoldenRetriever extends Dog {
    public GoldenRetriever(String name, int age, boolean isTrained) {
        super(name, age, isTrained);
    }

    public GoldenRetriever() {
    }

    public void fetch() {
        System.out.println("Fetching!");
    }
}
