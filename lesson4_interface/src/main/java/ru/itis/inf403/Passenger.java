package ru.itis.inf403;

public class Passenger {
    String name;

    public Passenger() {

    }

    public Passenger(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
