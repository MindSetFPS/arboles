package com.mycompany.app;

import java.awt.Color;
import java.awt.Graphics;

// Define the Node class for each node in the tree
class Node {
    int data;
    public int x = 0;
    public int y = 0;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    public void drawNode(int x, int y){
        paintNode(null);
    }
    
    public void paintNode(Graphics g){
        g.setColor(Color.GREEN);
        g.fillOval(x, y, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("5", 50, 50);
        // g.drawString("5", x , y);
    }
}

public class BinaryTree {

    // Root of the binary tree
    private Node root;

    // Constructor to create a new binary tree with no nodes
    public BinaryTree() {
        this.root = null;
    }

    // Method to insert a node into the binary tree
    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            _insert(data, root);
        }
    }

    // Helper method for inserting a node recursively
    private void _insert(int data, Node currentNode) {
        if (data < currentNode.data) {
            if (currentNode.left == null) {
                currentNode.left = new Node(data);
            } else {
                _insert(data, currentNode.left);
            }
        } else if (data > currentNode.data) {
            if (currentNode.right == null) {
                currentNode.right = new Node(data);
            } else {
                _insert(data, currentNode.right);
            }
        }
    }

    // Method to print the binary tree in-order
    public void printInOrder() {
        if (root != null) {
            _printInOrder(root);
        }
    }

    // Helper method for printing the binary tree in-order recursively
    private void _printInOrder(Node currentNode) {
        if (currentNode != null) {
            _printInOrder(currentNode.left);
            System.out.print(currentNode.data + " ");
            _printInOrder(currentNode.right);
        }
    }

    // Method to print the binary tree pre-order
    public void printPreOrder() {
        if (root != null) {
            _printPreOrder(root);
        }
    }

    // Helper method for printing the binary tree pre-order recursively
    private void _printPreOrder(Node currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.data + " ");
            _printPreOrder(currentNode.left);
            _printPreOrder(currentNode.right);
        }
    }

    // Method to print the binary tree post-order
    public void printPostOrder() {
        if (root != null) {
            _printPostOrder(root);
        }
    }

    // Helper method for printing the binary tree post-order recursively
    private void _printPostOrder(Node currentNode) {
        if (currentNode != null) {
            _printPostOrder(currentNode.left);
            _printPostOrder(currentNode.right);
            System.out.print(currentNode.data + " ");
        }
    }

    // Method to get the height of the binary tree
    public int getHeight() {
        return _getHeight(root);
    }

    // Helper method for getting the height of the binary tree recursively
    private int _getHeight(Node currentNode) {
        if (currentNode == null) {
            return 0;
        } else {
            int leftHeight = _getHeight(currentNode.left);
            int rightHeight = _getHeight(currentNode.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    // Method to check if the binary tree is balanced
    public boolean isBalanced() {
        return _isBalanced(root) != -1;
    }

    // Helper method for checking if the binary tree is balanced recursively
    private int _isBalanced(Node currentNode) {
        if (currentNode == null) {
            return 0;
        } else {
            int leftHeight = _getHeight(currentNode.left);
            int rightHeight = _getHeight(currentNode.right);
            if (Math.abs(leftHeight - rightHeight) > 1) {
                return -1; // Unbalanced
            }
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        System.out.println("In-order: ");
        tree.printInOrder();

        System.out.println("\nPre-order: ");
        tree.printPreOrder();

        System.out.println("\nPost-order: ");
        tree.printPostOrder();

        System.out.println("\nHeight: " + tree.getHeight());
        System.out.println("Is Balanced: " + tree.isBalanced());
    }
}