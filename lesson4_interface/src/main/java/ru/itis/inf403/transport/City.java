package ru.itis.inf403.transport;

public class City {
    String name;

    public City() {

    }

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}