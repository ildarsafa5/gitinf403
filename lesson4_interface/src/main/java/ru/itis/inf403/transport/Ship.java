package ru.itis.inf403.transport;

public class Ship implements TransportAction {
    private String name;

    public void move(City cityFrom, City cityTo, Passenger passenger) {
        System.out.println(passenger + "moved by ship from" + cityFrom + " to " + cityTo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
