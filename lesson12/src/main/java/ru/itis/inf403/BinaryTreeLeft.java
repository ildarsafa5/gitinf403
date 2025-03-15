package ru.itis.inf403;

public class BinaryTreeLeft extends BinaryTree{
    public void traversalTree(Node node) {
        if (node == null) return;
        traversalTree(node.left());
        System.out.println(node.value());
        traversalTree(node.right());
    }
}


