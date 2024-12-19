package ru.itis.inf403.transport;

public class Plane implements TransportAction {
    private int bortNumber;
    public void move(City cityFrom, City cityTo, Passenger passenger) {
        System.out.println(passenger + "moved by plane from" + cityFrom + " to " + cityTo);
    }

    public int getBortNumber() {
        return bortNumber;
    }

    public void setBortNumber(int bortNumber) {
        this.bortNumber = bortNumber;
    }

}
