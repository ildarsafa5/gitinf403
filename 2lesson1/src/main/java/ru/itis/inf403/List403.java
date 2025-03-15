package ru.itis.inf403;

public interface List403 {
    void add(Integer a); // добавляет элемент в конец списка
    void add(int pos, Integer a) throws IndexOutOfBoundsException; //добавляет элемент в указанную позицию
    Integer remove(int pos) throws IndexOutOfBoundsException; //удаляет элемент по индексу и выводит его
    int size(); //возвращает размер
    Integer indexOf(int position) throws IndexOutOfBoundsException; // обращение по индексу
    void sort(boolean flag); // сортировка по возрастанию(убыванию)








}
