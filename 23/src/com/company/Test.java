package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static java.awt.Color.YELLOW;
import static java.awt.Color.black;

public class Test extends Canvas {
    public Test() {
    }

    @Override
    public void paint(Graphics graphics) {
        final Circle[] circles = new Circle[7];
        circles[0] = new Circle(20, 20, 20, 20, Color.BLACK);
        circles[2] = new Circle(20, 20, 20, 20, Color.BLACK);
        circles[3] = new Circle(20, 20, 20, 20, Color.BLACK);
        circles[4] = new Circle(20, 20, 20, 20, Color.BLACK);
        circles[5] = new Circle(20, 20, 20, 20, Color.BLACK);
        circles[6] = new Circle(20, 20, 20, 20, Color.BLACK);
        System.out.println(circles);

    }

    public static void main(String[] args) {
        Test canvas = new Test();
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}


