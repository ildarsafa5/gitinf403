package ru.itis.inf403;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws BrokenCarException{
        CarsCollection cars = new CarsCollection(10);
        int s = 0;
        while (s<1000) {
            try {
                if (cars.getCntcars()<4) {
                    System.out.println("Экспедиция dead");
                    break;
                }
                s+=100;
                checking(cars);
            } catch (BrokenCarException e) {
                e.sendMessage();
            }
        }
        System.out.println("Экспедиция проехала " + s + " километров.");
    }

    public static void checking(CarsCollection cars) throws BrokenCarException{
        boolean flag = false;
        for (int i = 0; i < cars.getCntcars(); i++) {
            Random random = new Random();
            int random1 = random.nextInt(100);
            if (random1<=20) {
                cars.setCntcars(cars.getCntcars()-1);
                flag = true;
            }
        }
        if (flag) {
            throw new BrokenCarException("Осталось " + cars.getCntcars() + " машин");
        }
    }
}
