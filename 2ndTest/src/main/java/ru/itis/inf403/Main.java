package ru.itis.inf403;

public class Main {
    public static void main(String[] args) {
        ElevatorChet[] elevatorChets = new ElevatorChet[3];
        ElevatorChet lift1 = new ElevatorChet();
        ElevatorChet lift2 = new ElevatorChet();
        ElevatorChet lift3 = new ElevatorChet();
        elevatorChets[0] = lift1;
        elevatorChets[1] = lift2;
        elevatorChets[2] = lift3;
        ElevatorNeChet[] elevatorNeChets = new ElevatorNeChet[3];
        ElevatorNeChet lift4 = new ElevatorNeChet();
        ElevatorNeChet lift5 = new ElevatorNeChet();
        ElevatorNeChet lift6 = new ElevatorNeChet();
        elevatorNeChets[0] = lift4;
        elevatorNeChets[1] = lift5;
        elevatorNeChets[2] = lift6;
        ElevatorForWorker[] elevatorForWorkers = new ElevatorForWorker[1];
        ElevatorForWorker lift7 = new ElevatorForWorker();
        elevatorForWorkers[0] = lift7;
        Dinamic dinamic = new Dinamic(elevatorNeChets,elevatorChets,elevatorForWorkers);










    }

}
