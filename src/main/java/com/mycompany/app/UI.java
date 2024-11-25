package com.mycompany.app;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.*;

public class UI {
    JFrame window;
    JTabbedPane tabs;

    public UI() {
        this.init();
        this.BT1();
        this.BT2();
        this.BT3();
        this.BT4();
        this.BT5();
    }

    public void init() {
        window = new JFrame();
        window.setLayout(new BorderLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tabs = new JTabbedPane();
        window.add(tabs);
        window.setSize(800, 600);
        window.setVisible(true);
    }

    public void BT1() {
        JPanel panel = new JPanel();
        JLabel imageLabel;
        
        BinaryTree BT = new BinaryTree();
        
        BT.insert(100, "h");
        BT.insert(50, "i");
        BT.insert(75, "e");
        BT.insert(150, "m");
        BT.insert(125, "a");
        
        JLabel text = new JLabel();
        try {
            // Read the image file
            BufferedImage img = ImageIO.read(getClass().getResource("/1.png"));
            // Create a new JLabel and set its icon property to the image.
            imageLabel = new JLabel(new ImageIcon(img));
            // Add some layout to our window
            panel.setLayout(new BorderLayout());
            panel.add(imageLabel, BorderLayout.CENTER);
        } catch (IOException e) {
            System.err.println("Error reading image file: " + e.getMessage());
        }

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        JButton amplitud = new JButton("amplitud");
        amplitud.addActionListener(e -> {
            text.setText(BT.amplitud());
        });

        JButton inorden = new JButton("inorden");
        inorden.addActionListener(e -> {
            text.setText(BT.printInOrder());
        });

        JButton postorden = new JButton("postorden");
        postorden.addActionListener(e -> {
            text.setText(BT.printPostOrder());
        });
        
        JButton preorden = new JButton("preorden");
        preorden.addActionListener(e -> {
            text.setText(BT.printPreOrder());
        });

        buttonPanel.add(preorden);
        buttonPanel.add(inorden);
        buttonPanel.add(postorden);
        buttonPanel.add(amplitud);
        
        buttonPanel.add(text);

        panel.add(buttonPanel, BorderLayout.EAST);
        tabs.addTab("BT1", panel);
    }
    public void BT2() {
        JPanel panel = new JPanel();
        JLabel imageLabel;
        
        BinaryTree BT = new BinaryTree();
        
        BT.insert(100, "F");
        BT.insert(50, "B");
        BT.insert(25, "A");
        BT.insert(75, "D");
        BT.insert(70, "C");
        BT.insert(80, "E");
        BT.insert(200, "G");
        BT.insert(250, "I");
        BT.insert(225, "H");
        
        JLabel text = new JLabel();
        try {
            // Read the image file
            BufferedImage img = ImageIO.read(getClass().getResource("/2.png"));
            // Create a new JLabel and set its icon property to the image.
            imageLabel = new JLabel(new ImageIcon(img));
            // Add some layout to our window
            panel.setLayout(new BorderLayout());
            panel.add(imageLabel, BorderLayout.CENTER);
        } catch (IOException e) {
            System.err.println("Error reading image file: " + e.getMessage());
        }

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        JButton amplitud = new JButton("amplitud");
        amplitud.addActionListener(e -> {
            text.setText(BT.amplitud());
        });

        JButton inorden = new JButton("inorden");
        inorden.addActionListener(e -> {
            text.setText(BT.printInOrder());
        });

        JButton postorden = new JButton("postorden");
        postorden.addActionListener(e -> {
            text.setText(BT.printPostOrder());
        });
        
        JButton preorden = new JButton("preorden");
        preorden.addActionListener(e -> {
            text.setText(BT.printPreOrder());
        });

        buttonPanel.add(preorden);
        buttonPanel.add(inorden);
        buttonPanel.add(postorden);
        buttonPanel.add(amplitud);
        
        buttonPanel.add(text);

        panel.add(buttonPanel, BorderLayout.EAST);
        tabs.addTab("BT2", panel);
    }

public void BT3() {
        JPanel panel = new JPanel();
        JLabel imageLabel;
        
        BinaryTree BT = new BinaryTree();
        
        BT.insert(55, "55,");
        BT.insert(53, "53,");
        BT.insert(48, "48,");
        BT.insert(51, "51,");
        BT.insert(54, "54,");
        BT.insert(59, "59,");
        BT.insert(56, "56,");
        BT.insert(57, "57,");
        BT.insert(63, "63,");
        BT.insert(61, "61,");
        BT.insert(70, "70,");

        
        JLabel text = new JLabel();
        try {
            // Read the image file
            BufferedImage img = ImageIO.read(getClass().getResource("/3.png"));
            // Create a new JLabel and set its icon property to the image.
            imageLabel = new JLabel(new ImageIcon(img));
            // Add some layout to our window
            panel.setLayout(new BorderLayout());
            panel.add(imageLabel, BorderLayout.CENTER);
        } catch (IOException e) {
            System.err.println("Error reading image file: " + e.getMessage());
        }

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        JButton amplitud = new JButton("amplitud");
        amplitud.addActionListener(e -> {
            text.setText(BT.amplitud());
        });

        JButton inorden = new JButton("inorden");
        inorden.addActionListener(e -> {
            text.setText(BT.printInOrder());
        });

        JButton postorden = new JButton("postorden");
        postorden.addActionListener(e -> {
            text.setText(BT.printPostOrder());
        });
        
        JButton preorden = new JButton("preorden");
        preorden.addActionListener(e -> {
            text.setText(BT.printPreOrder());
        });

        buttonPanel.add(preorden);
        buttonPanel.add(inorden);
        buttonPanel.add(postorden);
        buttonPanel.add(amplitud);
        
        buttonPanel.add(text);

        panel.add(buttonPanel, BorderLayout.EAST);
        tabs.addTab("BT3", panel);
    }

    public void BT4() {
        JPanel panel = new JPanel();
        JLabel imageLabel;
        
        BinaryTree BT = new BinaryTree();
        
        BT.insert(200, "A,");
        BT.insert(100, "B,");
        BT.insert(1, "D,");
        BT.insert(300, "C,");
        BT.insert(120, "E,");
        BT.insert(110, "J,");
        BT.insert(111, "Q,");
        BT.insert(125, "K,");
        BT.insert(126, "R,");
        BT.insert(250, "G,");
        BT.insert(210, "L,");
        BT.insert(251, "M,");
        BT.insert(350, "H,");
        BT.insert(325, "Ñ,");
        BT.insert(355, "O,");

        JLabel text = new JLabel();
        try {
            // Read the image file
            BufferedImage img = ImageIO.read(getClass().getResource("/4.png"));
            // Create a new JLabel and set its icon property to the image.
            imageLabel = new JLabel(new ImageIcon(img));
            // Add some layout to our window
            panel.setLayout(new BorderLayout());
            panel.add(imageLabel, BorderLayout.CENTER);
        } catch (IOException e) {
            System.err.println("Error reading image file: " + e.getMessage());
        }

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        JButton amplitud = new JButton("amplitud");
        amplitud.addActionListener(e -> {
            text.setText(BT.amplitud());
        });

        JButton inorden = new JButton("inorden");
        inorden.addActionListener(e -> {
            text.setText(BT.printInOrder());
        });

        JButton postorden = new JButton("postorden");
        postorden.addActionListener(e -> {
            text.setText(BT.printPostOrder());
        });
        
        JButton preorden = new JButton("preorden");
        preorden.addActionListener(e -> {
            text.setText(BT.printPreOrder());
        });

        buttonPanel.add(preorden);
        buttonPanel.add(inorden);
        buttonPanel.add(postorden);
        buttonPanel.add(amplitud);
        
        buttonPanel.add(text);

        panel.add(buttonPanel, BorderLayout.EAST);
        tabs.addTab("BT4", panel);
    }

    public void BT5() {
        JPanel panel = new JPanel();
        JLabel imageLabel;
        
        BinaryTree BT = new BinaryTree();
        
        BT.insert(500, "A,");
        BT.insert(250, "B,");
        BT.insert(750, "C,");
        BT.insert(125, "D,");
        BT.insert(350, "E,");
        BT.insert(600, "F,");
        BT.insert(1000, "G,");
        BT.insert(50, "H,");
        BT.insert(150, "I,");
        BT.insert(300, "J,");
        BT.insert(400, "K,");
        BT.insert(550, "L,");
        BT.insert(700, "M,");
        BT.insert(800, "N,");
        BT.insert(1050, "O,");
        BT.insert(1005, "X,");
        BT.insert(1010, "Y,");

        JLabel text = new JLabel();
        try {
            // Read the image file
            BufferedImage img = ImageIO.read(getClass().getResource("/5.png"));
            // Create a new JLabel and set its icon property to the image.
            imageLabel = new JLabel(new ImageIcon(img));
            // Add some layout to our window
            panel.setLayout(new BorderLayout());
            panel.add(imageLabel, BorderLayout.CENTER);
        } catch (IOException e) {
            System.err.println("Error reading image file: " + e.getMessage());
        }

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        JButton amplitud = new JButton("amplitud");
        amplitud.addActionListener(e -> {
            text.setText(BT.amplitud());
        });

        JButton inorden = new JButton("inorden");
        inorden.addActionListener(e -> {
            text.setText(BT.printInOrder());
        });

        JButton postorden = new JButton("postorden");
        postorden.addActionListener(e -> {
            text.setText(BT.printPostOrder());
        });
        
        JButton preorden = new JButton("preorden");
        preorden.addActionListener(e -> {
            text.setText(BT.printPreOrder());
        });

        buttonPanel.add(preorden);
        buttonPanel.add(inorden);
        buttonPanel.add(postorden);
        buttonPanel.add(amplitud);
        
        buttonPanel.add(text);

        panel.add(buttonPanel, BorderLayout.EAST);
        tabs.addTab("BT5", panel);
    }
}