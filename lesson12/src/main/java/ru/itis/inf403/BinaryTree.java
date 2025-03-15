package ru.itis.inf403;

public abstract class BinaryTree {
    public abstract void traversalTree(Node node);
    public void addLeaf(int n,Node node) {
        if(n > node.value()) {
            if (node.right() == null) {
                Node uzel = new Node(n);
                node.setRight(uzel);
                return;
            } else {
                addLeaf(n,node.right());
            }
        } else {
            if (node.left() == null) {
                Node uzel = new Node(n);
                node.setLeft(uzel);
                return;
            } else {
                addLeaf(n,node.left());
            }
        }
    }
}
