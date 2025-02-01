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
                    if (random1 % 2 == 0) {
                        Random random2 = new Random();
                        int random3 = random2.nextInt(2);
                        switch (random3) {
                            case 0:
                                Call call1 = new Call(Necessity.Chet);
                                call1.calling(elevatorChets, elevatorNeChets, elevatorForWorkers, random1);
                                break;
                            case 1:
                                Call call2 = new Call(Necessity.Worker);
                                call2.calling(elevatorChets, elevatorNeChets, elevatorForWorkers, random1);
                                break;
                        }
                    } else {
                        Random random2 = new Random();
                        int random3 = random2.nextInt(2);
                        switch (random3) {
                            case 0:
                                Call call3 = new Call(Necessity.Nechet);
                                call3.calling(elevatorChets, elevatorNeChets, elevatorForWorkers, random1);
                                break;
                            case 1:
                                Call call4 = new Call(Necessity.Worker);
                                call4.calling(elevatorChets, elevatorNeChets, elevatorForWorkers, random1);
                                break;

                        }
                    }
                }
                i++;

            } catch(NoONeAvailable e){
                e.print();
            }
        }
    }
}
