package ru.itis.inf403;

public abstract class Elevator implements IElevator,Step {
    private Integer floorNow;
    private Integer floorAppointment;
    ElevatorState state;
    public ElevatorState state() {
        return state;
    }
    public void changeFloor() {
        if(state == ElevatorState.NotWorking | state == ElevatorState.Stay) {
            return;
        }
        if (state == ElevatorState.GoDown) {
            floorNow--;
        }
        if (state == ElevatorState.GoUp) {
            floorNow++;
        }
    }

    public Integer getFloorAppointment() {
        return floorAppointment;
    }

    public Integer getFloorNow() {
        return floorNow;
    }

    public void setFloorNow(Integer floorNow) {
        this.floorNow = floorNow;
    }

    public void setFloorAppointment(Integer floorAppointment) {
        this.floorAppointment = floorAppointment;
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }
}
