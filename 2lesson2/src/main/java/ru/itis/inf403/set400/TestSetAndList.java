package ru.itis.inf403.set400;

import ru.itis.inf403.linkedlist.LinkedListImpl;
import ru.itis.inf403.listAndSet.List403Impl;

import java.util.Random;

public class TestSetAndList {
    public static void main(String[] args) {
        addTest();
    }

    public static void addTest() {
        List403Impl list = new List403Impl();
        long start1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            Random ran1 = new Random();
            int ran11 = ran1.nextInt();
            list.add(ran11);
        }
        long end1 = System.nanoTime();
        LinkedListImpl linkedlist = new LinkedListImpl();
        long start2 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            Random ran1 = new Random();
            int ran11 = ran1.nextInt();
            linkedlist.add(ran11);
        }
        long end2 = System.nanoTime();
        System.out.println("Добавление");
        System.out.println(end1-start1);
        System.out.println(end2-start2);


        long start3 = System.nanoTime();
        for (int i = 0; i < 10001; i++) {
            Random ran1 = new Random();
            int ran11 = ran1.nextInt(list.size());
            list.remove(ran11);
        }
        long end3 = System.nanoTime();

        long start4 = System.nanoTime();
        for (int i = 0; i < 10001; i++) {
            Random ran1 = new Random();
            int ran11 = ran1.nextInt(linkedlist.size());
            linkedlist.remove(ran11);
        }
        long end4 = System.nanoTime();

        System.out.println("Удаление");
        System.out.println(end3-start3);
        System.out.println(end4-start4);



    }
}
