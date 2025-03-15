package ru.itis.inf403;

public class BinaryTreeMiddle extends BinaryTree{
    public void traversalTree(Node node) {
        if (node == null) return;
        traversalTree(node.left());
        traversalTree(node.right());
        System.out.println(node.value());
    }
}
