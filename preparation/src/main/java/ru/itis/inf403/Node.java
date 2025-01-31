package ru.itis.inf403;

public class Node implements IConstruction{
    private Stage stage;
    private Node next;
    private Node prev;

    public Node(Stage stage) {
        this.stage = stage;
        next = null;
        prev = null;
    }
    public Node() {

    }

    public Node next() {
        return next;
    }

    public Node prev() {
        return prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Stage getStage() {
        return stage;
    }
}
