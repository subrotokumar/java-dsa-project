package BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    Node head;
    Scanner scanner;

    BinaryTree() {
        head = null;
        scanner = new Scanner(System.in);
    }

    public Node create() {
        System.out.println("Enter Element : ");
        int val = scanner.nextInt();
        if (val == -1) return null;

        Node node = new Node(val);
        System.out.println("Insert at Left of Node " + val);
        node.left = create();
        System.out.println("Insert at right of Node " + val);
        node.right = create();
        return node;
    }

    void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public int height(Node root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public int size(Node root) {
        if (root == null) return 0;
        return size(root.right) + size(root.left) + 1;
    }

    public int maxValue(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.value, Math.max(maxValue(root.left), maxValue(root.left)));
    }

    public int minValue(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        return Math.min(root.value, Math.min(minValue(root.left), minValue(root.left)));
    }
}

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}