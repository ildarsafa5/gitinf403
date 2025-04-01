package ru.itis.inf403.utils;

import ru.itis.inf403.listAndSet.List403;
import ru.itis.inf403.listAndSet.Set400Impl;
import ru.itis.inf403.model.Transport;

import java.io.FileNotFoundException;
import java.util.Comparator;

public class TransportPrintService {
    public void printParkNumbers(List403<? extends Transport> list1) throws FileNotFoundException {
        List403<? extends Transport> list = TransportService.sortParkNumbers(list1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.indexOf(i).getNumber()+ " " + list.indexOf(i).getWorkTimeBegin());
        }
    }

    public <T extends Transport> void printParkNumbers2(List403<T> list) throws FileNotFoundException {
        list.sort(new Comparator<T>() {
            @Override
            public int compare(Transport o1, Transport o2) {
                return Integer.parseInt(o1.getNumber())-Integer.parseInt(o2.getNumber());
            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.indexOf(i).getNumber()+ " " + list.indexOf(i).getWorkTimeBegin());
        }
    }

    public void printRouteNumbers(List403<? extends Transport> list1) {
        List403<? extends Transport> list = TransportService.sortRouteNumbers(list1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.indexOf(i).getRouteNumber()+ " " + list.indexOf(i).getWorkTimeBegin()+ " " + list.indexOf(i).getWorkTimeEnd());
        }
    }

    public <T extends Transport> void printRouteNumbers2(List403<T> list) throws FileNotFoundException {
        list.sort(new Comparator<T>() {
            @Override
            public int compare(Transport o1, Transport o2) {
                return Integer.parseInt(o1.getRouteNumber())-Integer.parseInt(o2.getRouteNumber());
            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.indexOf(i).getRouteNumber()+ " " + list.indexOf(i).getWorkTimeBegin()+ " " + list.indexOf(i).getWorkTimeEnd());
        }
    }

    public void routes(List403<? extends Transport> list) {
        Set400Impl<Transport> set1 = new Set400Impl();
        Set400Impl<String> set2 = new Set400Impl();
        for (int i = 0; i < list.size(); i++) {
            set2.add(list.indexOf(i).getRouteNumber());
            set1.add(list.indexOf(i));
        }
        Transport[] set11 = set1.getAll(new Transport[0]);
        String[] set22 = set2.getAll(new String[0]);
        int[] values = new int[set22.length];
        for (int i = 0; i < set11.length; i++) {
            for (int j = 0; j < set22.length; j++) {
                if (set11[i].getRouteNumber().equals(set22[j])) {
                    values[j]++;
                    break;
                }
            }
        }
        for (int i = 0; i < set22.length; i++) {
            System.out.println("По маршруту " + set22[i] + " двигается " + values[i] + " транспортных средств");
        }
    }


    public void transports(List403<? extends Transport> list) {
        Set400Impl<String> set = new Set400Impl();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.indexOf(i).getNumber());
        }
        String[] set1 = set.getAll(new String[0]);
        System.out.println("Всего " + set1.length+ " различных транспортных средств");
    }

    public void routesCnt(List403<? extends Transport> list) {
        Set400Impl<String> set = new Set400Impl();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.indexOf(i).getRouteNumber());
        }
        String[] set1 = set.getAll(new String[0]);
        System.out.println(set1.length + " различных маршрутов");
    }
}
