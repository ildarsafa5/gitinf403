package ru.itis.inf403;

public class Call implements ICall {
    private Necessity necessity;

    public void calling(ElevatorChet[] elevatorchet,ElevatorNeChet[] elevatorNeChets, ElevatorForWorker[] elevatorForWorkers,Integer floorAppointment) throws NoONeAvailable{
        if (necessity == Necessity.Chet) {
            int i1 = 0;
            boolean ok = false;
            for (int i = 0; i < elevatorchet.length; i++) {
                if(elevatorchet[i].state() == ElevatorState.Stay) {
                    ok = true;
                    elevatorchet[i].setState(ElevatorState.GoDown);
                    for (int j = 1; j < elevatorchet[i].getFloorNow(); j++) {
                        elevatorchet[i].changeFloor();
                    }
                    elevatorchet[i].setState(ElevatorState.Stay);
                    i1=i;
                    break;
                }
            }
            if (!ok) {
                throw new NoONeAvailable();
            }
            elevatorchet[i1].setState(ElevatorState.GoUp);
            for (int i = 0; i < floorAppointment; i++) {
                elevatorchet[i].changeFloor();
            }
            elevatorchet[i1].setState(ElevatorState.Stay);


        } else if (necessity == Necessity.Nechet) {
            int i1=0;
            boolean ok = false;
            for (int i = 0; i < elevatorNeChets.length; i++) {
                if(elevatorNeChets[i].state() == ElevatorState.Stay) {
                    ok = true;
                    elevatorNeChets[i].setState(ElevatorState.GoDown);
                    for (int j = 1; j < elevatorNeChets[i].getFloorNow(); j++) {
                        elevatorNeChets[i].changeFloor();
                    }
                    elevatorNeChets[i].setState(ElevatorState.Stay);
                    i1=i;
                    break;
                }
            }
            if (!ok) {
                throw new NoONeAvailable();
            }
            elevatorNeChets[i1].setState(ElevatorState.GoUp);
            for (int i = 0; i < floorAppointment; i++) {
                elevatorNeChets[i].changeFloor();
            }
            elevatorNeChets[i1].setState(ElevatorState.Stay);

        } else {
            boolean ok = false;
            int i1=0;
            for (int i = 0; i < elevatorForWorkers.length; i++) {
                if(elevatorForWorkers[i].state() == ElevatorState.Stay) {
                    ok = true;
                    elevatorForWorkers[i].setState(ElevatorState.GoDown);
                    for (int j = 1; j < elevatorForWorkers[i].getFloorNow(); j++) {
                        elevatorForWorkers[i].changeFloor();
                    }
                    elevatorForWorkers[i].setState(ElevatorState.Stay);
                    i1=i;
                    break;
                }
            }
            if (!ok) {
                throw new NoONeAvailable();
            }
            elevatorForWorkers[i1].setState(ElevatorState.GoUp);
            for (int i = 0; i < floorAppointment; i++) {
                elevatorForWorkers[i].changeFloor();
            }
            elevatorForWorkers[i1].setState(ElevatorState.Stay);
        }






    }
}
