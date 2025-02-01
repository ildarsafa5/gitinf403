package ru.itis.inf403;

import java.util.Random;

public class Dinamic {
    private ElevatorForWorker[] elevatorForWorkers;
    private ElevatorChet[] elevatorChets;
    private ElevatorNeChet[] elevatorNeChets;
    public Dinamic(ElevatorNeChet[] elevatorNeChets,ElevatorChet[] elevatorChets, ElevatorForWorker[] elevatorForWorkers) {
        this.elevatorChets = elevatorChets;
        this.elevatorForWorkers = elevatorForWorkers;
        this.elevatorNeChets = elevatorNeChets;
    }
    public void dinamic() throws NoONeAvailable{
        int i=0;
        while(i<10000) {
            try {
                if (i%20==0) {
                    Random random = new Random();
                    int random1 = random.nextInt(16);
                    Call call = new Call();
                    call.calling(elevatorChets,elevatorNeChets,elevatorForWorkers,random1);
                }
                i++;


            } catch(NoONeAvailable e){
                System.out.println("Все лифты заняты");
            }
        }
    }
}
