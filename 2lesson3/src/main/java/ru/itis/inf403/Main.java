package ru.itis.inf403;

public class Main {
    public static void main(String[] args) {
        Set400Impl<Fruit> list = new Set400Impl<>();

        list.add(new Fruit("Яблоко",5));
        list.add(new Fruit("Груша",7));
        list.add(new Fruit("Апельсин",2));
        list.add(new Fruit("Яблоко",5));

        System.out.println(list);

        Fruit[] a = list.getAll(new Fruit[0]);
        for(Fruit i : a) {
            System.out.println(i);
        }

        Fruit first = new Fruit("Яблоко",12);
        Fruit second = new Fruit("Яблоко",12);
        System.out.println(first.hashCode());
        System.out.println(second.hashCode());



    }
}