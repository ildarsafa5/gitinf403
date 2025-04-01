package ru.itis.inf403.model;

public class Trolleybus extends Transport {
    public Trolleybus(String number, String routeNumber, String workTimeBegin, String workTimeEnd) {
        super(number,routeNumber,workTimeBegin,workTimeEnd);
    }

    public Trolleybus() {}

    @Override
    public String toString() {
        return "Trolleybus{" +
                "number='" + number + '\'' +
                ", routeNumber='" + routeNumber + '\'' +
                ", workTimeBegin='" + workTimeBegin + '\'' +
                ", workTimeEnd='" + workTimeEnd + '\'' +
                '}';
    }



}
