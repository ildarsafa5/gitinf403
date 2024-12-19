package ru.itis.inf403;

import ru.itis.inf403.apple.ListDirection;
import ru.itis.inf403.transport.Plane;
import ru.itis.inf403.transport.Ship;
import ru.itis.inf403.transport.Train;
import ru.itis.inf403.apple.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        City Kazan = new City("Казань");
//        City Saransk = new City("Саранск");
//        Passenger Roma = new Passenger("Роман");
//
//        TransportAction[] transports = {
//                new Plane(), new Ship(), new Train()
//        };
//
//        Random random = new Random();
//        int index = random.nextInt(3);
//        transports[index].move(Kazan,Saransk,Roma);
//
//        Plane plane = (Plane) transports[index];  нельзя переобразовать Train и Ship в Plane
//        System.out.println(plane);

        ListDirection list2 = new ListDirection();

        list2.add(new Apple("Красный", 55, "Антоновка", 120));
        list2.add(new Apple("Зелёный", 60, "Грени", 100));
        list2.add(new Apple("Жёлтый", 80, "Голден", 130));
        list2.add(new Apple("Сливовый", 75, "Спартан", 90));
        list2.add(new Apple("Алый", 70, "Гала", 150));
        list2.add(new Apple("Красно-белый", 65, "Башкирская красавица", 120));
        list2.print();
        list2.add(3,new Apple("Зелёный", 64, "Семеринская", 110));
        list2.print();
        System.out.println(list2.pop());
        list2.print();
        System.out.println(list2.remove(2));
        list2.print();
        list2.printReverse();
        System.out.println();
        list2.sort();
        list2.print();

        ListDirection list = new ListDirection();
        list.add(new Apple("Красный", 55, "Антоновка", 5));
        list.add(new Apple("Зелёный", 60, "Грени", 4));
        list.add(new Apple("Жёлтый", 80, "Голден", 3));
        list.add(new Apple("Сливовый", 75, "Спартан", 2));
        list.add(new Apple("Алый", 70, "Гала", 2));
        list.add(new Apple("Красно-белый", 65, "Башкирская красавица", 4));
        list.print();
        list.sort();
        list.print();





    }




}
