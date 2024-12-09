package ru.itis.inf403.model;

public class GoldenRetriever extends Dog {
    public GoldenRetriever(String name) {
        super(name);
    }

    public GoldenRetriever() {
    }

    public void fetch() {
        System.out.println("Fetching!");
    }
}
