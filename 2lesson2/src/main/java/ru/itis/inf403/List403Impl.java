package ru.itis.inf403.obj1;

import ru.itis.inf403.List403;

public class List403Impl<T> implements List403<T> {
    private Object[] array;
    private int size;

    public List403Impl() {
        this.array = new Object[10];
        this.size = 0;
    }
    private void grow() {
        Object[] newarray = new Object[(int)(size*1.5)];
        for (int i = 0; i < size; i++) {
            newarray[i] = array[i];
        }
        array = newarray;
    }
    public void add(T a){
        if (size==array.length) {
            grow();
        }
        array[size++] = a;
    } // добавляет элемент в конец списка
    public void add(int pos, Object a) throws IndexOutOfBoundsException{
        if (pos>size-1 || pos<0) {
            throw new IndexOutOfBoundsException();
        }
        if (size==array.length) {
            grow();
        }
        for (int i = size; i > pos ; i--) {
            array[i] = array[i-1];
        }
        size++;
        array[pos] = a;
    } //добавляет элемент в указанную позицию
    public T remove(int pos) throws IndexOutOfBoundsException{
        if (pos>size-1 || pos<0) {
            throw new IndexOutOfBoundsException();
        }
        T value = (T) array[pos];
        for (int i = pos; i < size-1; i++) {
            array[i] = array[i+1];
        }
        size--;
        return value;
    } //удаляет элемент по индексу и выводит его
    public int size(){
        return size;
    } //возвращает размер
    public T indexOf(int position) throws IndexOutOfBoundsException {
        if (position>size-1 || position<0) {
            throw new IndexOutOfBoundsException();
        } else {
            return (T)array[position];
        }
    } // обращение по индексу

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size; i++) {
            s.append(array[i]).append(" ");
        }
        return s.toString();
    }
}
