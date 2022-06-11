package com.example.assignmm;

import javax.swing.*;

public class HelloApplication {
    public static void main(String[] args) {
        JFrame f = new Hello();

        f.setSize(600, 500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}