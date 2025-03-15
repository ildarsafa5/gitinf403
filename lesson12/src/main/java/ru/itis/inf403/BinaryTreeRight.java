package ru.itis.inf403;

public class BinaryTreeRight extends BinaryTree {
    public void traversalTree(Node node) {
        if (node == null) return;
        traversalTree(node.right());
        System.out.println(node.value());
        traversalTree(node.left());
    }
}
