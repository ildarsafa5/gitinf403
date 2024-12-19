package ru.itis.inf403.transport;

public interface TransportAction {
    void move(City cityFrom, City cityTo, Passenger passenger);
}
