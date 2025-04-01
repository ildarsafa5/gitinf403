package ru.itis.inf403.set400;

public interface Set400<T> {
    int size();
    boolean contains(T element);
    void add(T element);
    T[] getAll(T[] c);
    T remove(T element);

}
