package ru.itis.inf403.model;

public class Bus extends Transport {
    public Bus(String number, String routeNumber, String workTimeBegin, String workTimeEnd) {
        super(number,routeNumber,workTimeBegin,workTimeEnd);
    }

    public Bus() {}

    @Override
    public String toString() {
        return "Bus{" +
                "number='" + number + '\'' +
                ", routeNumber='" + routeNumber + '\'' +
                ", workTimeBegin='" + workTimeBegin + '\'' +
                ", workTimeEnd='" + workTimeEnd + '\'' +
                '}';
    }

}
