package ru.itis.inf403;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Дмитрий", "Анатольевич", "Медведев",Gender.valueOf("Мужской"), Color.White);
        System.out.println(person);
        System.out.println(Gender.findByCode(1));
    }
}
