package ru.itis.inf403.transport;

public class Train implements TransportAction {
    private String category;

    public void move(City cityFrom, City cityTo, Passenger passenger) {
        System.out.println(passenger + "moved by train from" + cityFrom + " to " + cityTo);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
