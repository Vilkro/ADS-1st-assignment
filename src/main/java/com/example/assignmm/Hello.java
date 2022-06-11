package com.example.assignmm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hello extends JFrame {
    public Hello() {
        JPanel panel = new JPanel();

        JButton button = new JButton("Display");
        JTextField tf = new JTextField("0", 5);

        panel.add(new JLabel("Enter an order: "));
        panel.add(tf);
        panel.add(button);

        add(panel);

        add(BorderLayout.SOUTH, panel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int order = Integer.parseInt(tf.getText());
                setOrder(order);
            }
        });
    }

    private int order = 0;

    public void setOrder(int order) {
        this.order = order;
        repaint();
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);

        Point center = new Point(getWidth() / 2, getHeight() / 2);
        graphics.setColor(Color.black);
        drawHTree(graphics, order, center, 100);
    }

    private void drawHTree(Graphics graphics, int order,
                           Point center, int size) {
        graphics.drawLine(
                (int) (center.getX() - size),
                (int) (center.getY() - size),
                (int) (center.getX() - size),
                (int) (center.getY() + size));

        graphics.drawLine(
                (int) (center.getX() + size),
                (int) (center.getY() - size),
                (int) (center.getX() + size),
                (int) (center.getY() + size));

        graphics.drawLine(
                (int) (center.getX() - size),
                (int) center.getY(),
                (int) (center.getX() + size),
                (int) center.getY());

        if (order > 0) {
            Point p1Points = new Point((int)(center.getX() - size), (int)(center.getY() - size));
            Point p2Points = new Point((int)center.getX() - size, (int)center.getY() + size);
            Point p3Points = new Point((int)center.getX() + size, (int)center.getY() - size);
            Point p4Points = new Point((int)center.getX() + size, (int)center.getY() + size);

            drawHTree(graphics, order - 1, p1Points, size / 2);
            drawHTree(graphics, order - 1, p2Points, size / 2);
            drawHTree(graphics, order - 1, p3Points, size / 2);
            drawHTree(graphics, order - 1, p4Points, size / 2);
        }
    }
}
