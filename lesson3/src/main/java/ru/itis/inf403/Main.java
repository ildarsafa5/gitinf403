package ru.itis.inf403;

import ru.itis.inf403.model.Node;
public class Main {
    public static void main(String[] args) {
        Node first = new Node((int)(Math.random()*100));
        System.out.println("Первый "+first.value);
        for (int i = 0; i < 30; i++) {
            add(first,(int)(Math.random()*100));
        }
        Node current = first;
        for (int i = 0; i < 16; i++) {
            current = current.next;
        }
        System.out.println("17-й: " + current.value);
        current = first;
        for (int i = 0; i < 30; i++) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
        current = first;
        for (int i = 29; i >= 0; i--) {
            current = first;
            for (int j = 0; j < i; j++) {
                current = current.next;
            }
            System.out.print(current.value+ " ");
        }
    }

    public static Node findLast(Node first) {
        Node current  = first;
        while(current.next != null) {
            current = current.next;
        }

        return current;
    }

    public static void add(Node first, int value) {
        Node last = findLast(first);
        Node newelement = new Node(value);

        last.next = newelement;
    }
}
