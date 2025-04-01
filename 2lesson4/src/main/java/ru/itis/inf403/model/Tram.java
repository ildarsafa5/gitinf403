package ru.itis.inf403.model;

public class Tram extends Transport {
    public Tram(String number, String routeNumber, String workTimeBegin, String workTimeEnd) {
        super(number,routeNumber,workTimeBegin,workTimeEnd);
    }

    public Tram() {}

    @Override
    public String toString() {
        return "Tram{" +
                "number='" + number + '\'' +
                ", routeNumber='" + routeNumber + '\'' +
                ", workTimeBegin='" + workTimeBegin + '\'' +
                ", workTimeEnd='" + workTimeEnd + '\'' +
                '}';
    }

}
