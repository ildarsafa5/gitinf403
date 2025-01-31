package ru.itis.inf403;

import java.util.Random;

public class Main implements IBuilding {
    public static void main(String[] args) throws EndingException,BrokeException {
        ConstructionDirection list = new ConstructionDirection(new Node(new Project()));
        list.add(new Foundation());
        list.add(new Walls());
        list.add(new Roof());
        list.add(new Finishing());
        Main main = new Main();
        main.building(list);
    }

    public void building(ConstructionDirection list) throws BrokeException,EndingException {
        System.out.println("Стройка началась");
        int i = 0;
        while (i<5) {
            try{
                if (list.getFromIndex(i).prev() == null) {
                    list.getFromIndex(i).getStage().setStatus(Status.Implemented);
                    list.getFromIndex(i+1).getStage().setStatus(Status.Planed);
                } else if (list.getFromIndex(i).next() == null) {
                    list.getFromIndex(i).getStage().setStatus(Status.Implemented);
                    list.getFromIndex(i-1).getStage().setStatus(Status.Done);
                } else {
                    list.getFromIndex(i).getStage().setStatus(Status.Implemented);
                    list.getFromIndex(i-1).getStage().setStatus(Status.Done);
                    list.getFromIndex(i+1).getStage().setStatus(Status.Planed);
                }
                if (!shara(list.getFromIndex(i))) {
                    if (!shara(list.getFromIndex(i)) && list.getFromIndex(i).prev() == null) {
                        throw new EndingException();
                    }
                    --i;
                    throw new BrokeException();
                }
                i++;

            } catch(BrokeException e) {
                System.out.println("Этап провалился");
            } catch(EndingException e) {
                System.out.println("Стройка отменяется");
                break;
            }

        }
        if (i == 5) {
            System.out.println("Стройка окончена");
        }

    }

    public boolean shara(Node current) {
        Random random = new Random();
        int random1 = random.nextInt(100);
        if (random1 <= 50 ) {
            current.getStage().setStatus(Status.Rejected);
            return false;
        }
        return true;
    }


}
