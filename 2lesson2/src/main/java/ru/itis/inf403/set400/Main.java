package ru.itis.inf403.set400;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        addTest();
    }

    public static void addTest() {
        Set400Impl<Integer> set = new Set400Impl<Integer>();
        set.add(15);
        set.add(3);
        set.add(6);
        set.add(15);
        set.add(3);
        set.add(55);
        set.add(2);
        set.add(67);
        set.add(88);
        set.add(87);
        set.add(89);
        System.out.println(set.size());
        set.add(84);
        set.remove(3);
        set.add(123);
        System.out.println(set.size());
        Integer a[] = set.getAll(new Integer[0]);
        for(Integer i : a) {
            System.out.println(i);
        }
    }
}
