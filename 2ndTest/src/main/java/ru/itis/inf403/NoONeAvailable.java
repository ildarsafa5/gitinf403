package ru.itis.inf403;

public class NoONeAvailable extends Exception {
    private String message;
    public NoONeAvailable(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(message);
    }
}
