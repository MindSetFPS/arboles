package com.mycompany.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // System.out.println("Created GUI on EDT? " +
        // SwingUtilities.isEventDispatchThread());
        // JPanel rightJPanel = new JPanel();
        // JPanel leftPanel = new JPanel();
        // leftPanel.setLayout(new GridLayout(0, 1));
        // leftPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        // leftPanel.add(new Canvas());
        // leftPanel.add(new Circle());
        // JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel,
        // rightJPanel);
        // JFrame f = new JFrame("Swing Paint Demo");
        // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // f.setSize(1000, 600);
        // f.add(new Canvas());
        // rightJPanel.add(new JButton("ola amigos"));
        // f.add(splitPane);
        // f.pack();
        // f.setVisible(true);
        //

        UI ui = new UI();
    }
}

class Canvas extends JPanel {
    RedSquare redSquare = new RedSquare();
    // Circle circle = new Circle();

    public Canvas() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                moveSquare(e.getX(), e.getY());
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                // moveSquare(e.getX(),e.getY());
                renderTree();
            }
        });
    }

    private void renderTree() {
        System.out.println(getWidth());
    }

    private void moveSquare(int x, int y) {
        // Current square state, stored as final variables
        // to avoid repeat invocations of the same methods.
        final int CURR_X = redSquare.getX();
        final int CURR_Y = redSquare.getY();
        final int CURR_W = redSquare.getWidth();
        final int CURR_H = redSquare.getHeight();

        int OFFSET = 1;

        if ((CURR_X != x) || (CURR_Y != y)) {
            // The square is moving, repaint background
            // over the old square location.
            repaint(CURR_X, CURR_Y, CURR_W + OFFSET, CURR_H + OFFSET);

            // Update coordinates.
            redSquare.setX(x);
            redSquare.setY(y);

            // Repaint the square at the new location.
            repaint(redSquare.getX(), redSquare.getY(), redSquare.getWidth() + OFFSET, redSquare.getHeight() + OFFSET);
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(1250, 700);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("This is my custom Panel!", 10, 20);
        redSquare.paintShape(g);
        // myNode.paintNode(g);
    }
}

class RedSquare {
    private int xPos = 50;
    private int yPos = 50;
    private int width = 20;
    private int height = 20;

    public void setX(int xPos) {
        this.xPos = xPos;
    }

    public int getX() {
        return xPos;
    }

    public void setY(int yPos) {
        this.yPos = yPos;
    }

    public int getY() {
        return yPos;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void paintShape(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(xPos, yPos, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(xPos, yPos, width, height);
    }
}
