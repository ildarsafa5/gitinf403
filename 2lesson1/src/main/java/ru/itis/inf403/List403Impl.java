package ru.itis.inf403;

public class List403Impl implements List403{
    private Integer[] array;
    private int size;

    public List403Impl() {
        this.array = new Integer[10];
        this.size = 0;
    }
    private void grow() {
        Integer[] newarray = new Integer[(int)(size*1.5)];
        for (int i = 0; i < size; i++) {
            newarray[i] = array[i];
        }
        array = newarray;
    }
    public void add(Integer a){
        if (size==array.length) {
            grow();
        }
        array[size++] = a;
    } // добавляет элемент в конец списка
    public void add(int pos, Integer a) throws IndexOutOfBoundsException{
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
    public Integer remove(int pos) throws IndexOutOfBoundsException{
        if (pos>size-1 || pos<0) {
            throw new IndexOutOfBoundsException();
        }
        Integer value = array[pos];
        for (int i = pos; i < size-1; i++) {
            array[i] = array[i+1];
        }
        size--;
        return value;
    } //удаляет элемент по индексу и выводит его
    public int size(){
        return size;
    } //возвращает размер
    public Integer indexOf(int position) throws IndexOutOfBoundsException {
        if (position>size-1 || position<0) {
            throw new IndexOutOfBoundsException();
        } else {
            return array[position];
        }
    } // обращение по индексу
    public void sort(boolean flag){
        if (flag) {
            for (int i = size-1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[i]<array[j]) {
                        Integer temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        } else {
            for (int i = size-1; i >=0; i--) {
                for (int j = 0; j < i; j++) {
                    if(array[i]>array[j]) {
                        Integer temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    } // сортировка по возрастанию(убыванию)

    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += array[i] + " ";
        }
        return s;
    }
}
