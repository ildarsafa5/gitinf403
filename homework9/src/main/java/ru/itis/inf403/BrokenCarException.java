package ru.itis.inf403;

public class BrokenCarException extends Exception {
    public BrokenCarException(String message) {
        super(message);
    }

    public void sendMessage() {
        System.out.println(getMessage());
    }
}
