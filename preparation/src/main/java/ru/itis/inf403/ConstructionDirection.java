package ru.itis.inf403;

public class ConstructionDirection {
    private Node first;
    private Node last;

    public ConstructionDirection(Node first) {
        this.first = first;
    }

    public void add(Stage value) {
        Node novaya = new Node(value);
        if (first == null) {
            first = novaya;
        }
        else {
            Node current = first;
            while (current.next() != null) {
                current = current.next();
            }
            current.setNext(novaya);
            current.next().setPrev(current);
            last = novaya;
        }
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public Node getFromIndex(int i) {
        Node node = first;
        for (int j = 0; j < i; j++) {
            node = node.next();
        }
        return node;
    }
}
