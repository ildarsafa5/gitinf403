package ru.itis.inf403;

import ru.itis.inf403.model.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Петров", "Александрович" , 88, "Сеня");
        Student student = new Student("11-403",100,"Петрович","Семёнов","Саша", 32);
        System.out.println(student);
        System.out.println(person);
    }
}
