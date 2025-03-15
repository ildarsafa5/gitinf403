package obj;

import ru.itis.inf403.List403;
import ru.itis.inf403.List403Impl;

public class LinkedListImpl<T> implements LinkedList<T> {

    class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node<T> first;

    public LinkedListImpl() {
    }

    public void add(T value) {
        if (first == null) {
            first = new Node<T>(value);
        }
        else {
            Node<T> current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<T>(value);
            current.next.prev = current;
        }
    }

    public void add(int position, T value) throws IndexOutOfBoundsException{
        int cnt = findLastindex();
        Node<T> current = first;
        if (position <= cnt){
            Node<T> news = new Node<T>(value);
            current = first;
            for (int i = 1; i < position; i++) {
                current = current.next;
            }
            Node<T> prevPositionNode = current;
            current.prev.next = news;
            news.prev = current.prev;
            news.next = prevPositionNode;
            prevPositionNode.prev = news;
        } else if (position == cnt + 1 ) {
            add(value);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public T pop() {
        Node<T> current = first;
        while (current.next != null) {
            current = current.next;
        }
        current.prev.next = null;
        return (T) current.value;
    }

    public T remove(int position) {
        Node<T> current = first;
        for (int i = 1; i < position-1; i++) {
            current = current.next;
        }
        Node<T> current1 = current.next;
        current.next = current.next.next;
        current.next.next.prev = current;
        return (T) current1.value;
    }

    public int findLastindex() {
        int cnt = 1;
        Node<T> current = first;
        while (current.next != null) {
            cnt++;
            current = current.next;
        }
        return cnt;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node<T> current = first;
        s.append(first.value).append(" ");
        while (current.next != null) {
            s.append(" | ").append(current.next.value);
            current = current.next;
        }
        return s.toString();
    }
}
