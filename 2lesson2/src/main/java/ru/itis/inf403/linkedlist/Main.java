package ru.itis.inf403.linkedlist;

public class Main {
    public static void main(String[] args) {
        addTest();
    }

    public static void addTest() {
        LinkedListImpl<Integer> list = new LinkedListImpl<Integer>(10);
        list.add(15);
        list.add(1);
        list.add(1,2);
        list.add(3,11);
        list.add(6,17);
        list.remove(2);
        list.pop();
        System.out.println(list.indexOf(3));
        System.out.println(list);
    }
}
