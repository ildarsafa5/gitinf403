package ru.itis.inf403.listAndSet;

public interface List403<T> {
    void add(T a); // добавляет элемент в конец списка
    void add(int pos, T a) throws IndexOutOfBoundsException; //добавляет элемент в указанную позицию
    T remove(int pos) throws IndexOutOfBoundsException; //удаляет элемент по индексу и выводит его
    int size(); //возвращает размер
    T indexOf(int position) throws IndexOutOfBoundsException; // обращение по индексу









}
