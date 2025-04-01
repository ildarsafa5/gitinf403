package ru.itis.inf403.linkedlist;

public interface LinkedList<T> {
    public void add(T element);
    public void add(int position, T value);
    public T pop();
    public T remove(int position);
    public T indexOf(int position);

}
