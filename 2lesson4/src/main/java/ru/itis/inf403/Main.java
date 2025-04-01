package ru.itis.inf403;

import ru.itis.inf403.listAndSet.List403;
import ru.itis.inf403.model.Bus;
import ru.itis.inf403.model.Tram;
import ru.itis.inf403.model.Transport;
import ru.itis.inf403.model.Trolleybus;
import ru.itis.inf403.utils.TransportPrintService;
import ru.itis.inf403.utils.TransportService;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TransportService transportService = new TransportService("transport.csv");
        List403<Transport> transports = transportService.readAll();
        List403<Bus> busses = transportService.readAllBus();
        List403<Tram> trams = transportService.readAllTram();
        List403<Trolleybus> trolleybusses = transportService.readAllTrolleybus();
        System.out.println(transports);
        System.out.println(trams);
        System.out.println(trolleybusses);
        System.out.println(busses);


        TransportPrintService transportPrintService = new TransportPrintService();


        transportPrintService.routes(transports);
        System.out.println();
        transportPrintService.routes(busses);
        System.out.println();                          //По списку вывести номер маршрута и кол-во транспортных средств на нем
        transportPrintService.routes(trams);
        System.out.println();
        transportPrintService.routes(trolleybusses);
        System.out.println();
        System.out.println("-------------------------------");
        transportPrintService.transports(transports); //По списку вывести кол-во разных транспортных средств
        transportPrintService.transports(busses);
        transportPrintService.transports(trolleybusses);
        transportPrintService.transports(trams);
        System.out.println("-------------------------------");
        transportPrintService.routesCnt(transports);  //По списку вывести кол-во разных маршрутов
        System.out.println();
        System.out.println("-------------------------------");
        transportPrintService.printParkNumbers(transports);// По списку вывести в упорядоченном виде парковые номера и время начала движения
        System.out.println("-------------------------------");
        transportPrintService.printRouteNumbers(transports); //По списку вывести в упорядоченном виде номера маршрутов, время начала и окончнания движения маршрута
        System.out.println("-------------------------------");
        transportPrintService.printParkNumbers(trams);
        System.out.println("-------------------------------");
        transportPrintService.printParkNumbers(trolleybusses);
        System.out.println("-------------------------------");
        transportPrintService.printParkNumbers(busses);
        System.out.println("-------------------------------");
        transportPrintService.printRouteNumbers(trams);
        System.out.println("-------------------------------");
        transportPrintService.printRouteNumbers(trolleybusses);
        System.out.println("-------------------------------");
        transportPrintService.printRouteNumbers(busses);
        System.out.println("-------------------------------");
        transportPrintService.printParkNumbers2(transports);
        System.out.println("-------------------------------");
        transportPrintService.printRouteNumbers2(transports);







    }

}
