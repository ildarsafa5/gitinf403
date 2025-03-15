package ru.itis.inf403;


public class Main {
    public static void main(String[] args) {
        List403Impl myList = new List403Impl();
        myList.add(12);
        myList.add(4);
        myList.add(3);
        myList.add(6);
        myList.add(2,32);
        System.out.println(myList);
        System.out.println(myList.indexOf(2));
        myList.remove(myList.size()-1);
        myList.sort(true);
        System.out.println(myList);
        myList.sort(false);
        System.out.println(myList);



    }
}
