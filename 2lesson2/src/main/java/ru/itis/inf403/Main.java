package ru.itis.inf403.obj1;

import ru.itis.inf403.List403Impl;

public class Main {
    public static void main(String[] args) {
        addTest();
    }

    public static void addTest() {
        List403Impl<Integer> list = new List403Impl<Integer>();

        list.add(1);
        list.add("2");
        list.add(3);

        System.out.println(list);
    }
}
