package com.mycompany.app;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Queue;

// Define the Node class for each node in the tree
class Node {
    int index;
    String value;
    public int x = 0;
    public int y = 0;
    Node left;
    Node right;

    public Node(int index, String value) {
        this.index = index;
        this.value = value ;
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
    public void insert(int index, String value) {
        if (root == null) {
            root = new Node(index, value);
        } else {
            _insert(index, value, root);
        }
    }
    // Helper method for inserting a node recursively
    private void _insert(int data, String value, Node currentNode) {
        if (data < currentNode.index) {
            if (currentNode.left == null) {
                currentNode.left = new Node(data, value);
            } else {
                _insert(data, value, currentNode.left);
            }
        } else if (data > currentNode.index) {
            if (currentNode.right == null) {
                currentNode.right = new Node(data, value);
            } else {
                _insert(data, value, currentNode.right);
            }
        }
    }
    // Method to print the binary tree in-order
    public String printInOrder() {
        String text = "";
        if (root != null) {
            text = text + _printInOrder(root);
        }
        return text;
    }
    // Helper method for printing the binary tree in-order recursively
    private String _printInOrder(Node currentNode) {
        String text = "";
        if (currentNode != null) {
            text = text + _printInOrder(currentNode.left);
            // System.out.print(currentNode.value + " ");
            text = text + currentNode.value + " ";
            text = text + _printInOrder(currentNode.right);
        }
        return text;
    }
    // Method to print the binary tree pre-order
    public String printPreOrder() {
        String text = "";
        if (root != null) {
            text = text + _printPreOrder(root);
        }
        
        return text;
    }
    // Helper method for printing the binary tree pre-order recursively
    private String _printPreOrder(Node currentNode) {
        String text = "";
        if (currentNode != null) {
            // System.out.print(currentNode.value + " ");
            text = text + currentNode.value;
            text = text + _printPreOrder(currentNode.left);
            text = text + _printPreOrder(currentNode.right);
        }
        return text;
    }
    // Method to print the binary tree post-order
    public String printPostOrder() {
        String text = "";
        if (root != null) {
            text = text + _printPostOrder(root);
        }
        return text;
    }
    // Helper method for printing the binary tree post-order recursively
    private String _printPostOrder(Node currentNode) {
        String text = "";
        if (currentNode != null) {
            text = text + _printPostOrder(currentNode.left);
            text = text + _printPostOrder(currentNode.right);
            System.out.print(currentNode.value + " ");
            text = text + currentNode.value;
        }
        return text;
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
    // Method to perform Breadth-First Search (BFS)
    public String amplitud() {
        String text = "";
        if (root != null) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            // System.out.println(root.index);
            text = text + root.value;
            while (!queue.isEmpty()) {
                Node currentNode = queue.poll();
                // System.out.println(currentNode.data + " "); ????????????????????
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                    // System.out.print(currentNode.left.value);
                    text = text + currentNode.left.value;
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                    System.out.println(currentNode.right.value);
                    text = text + currentNode.right.value;
                }
            }
        }
        return text;
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5, "5");
        tree.insert(3, "ostia");
        tree.insert(7, "7");
        // tree.insert(12);
        // tree.insert(2);
        // tree.insert(4);
        // tree.insert(6);
        // tree.insert(8);
        // tree.insert(9);
        // tree.printBreadthFirst();
        // System.out.println("In-order: ");
        tree.printInOrder();
        // System.out.println("\nPre-order: ");
        // tree.printPreOrder();
        // System.out.println("\nPost-order: ");
        // tree.printPostOrder();
        // System.out.println("\nHeight: " + tree.getHeight());
        // System.out.println("Is Balanced: " + tree.isBalanced());
    }
}