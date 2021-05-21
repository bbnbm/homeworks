package com.company;

import javax.swing.*;
import java.awt.*;

public class Test extends Canvas {
public Test(){}
@Override
public void paint(Graphics graphics) {
    final Parabola[] parabolas = new Parabola[2];
    parabolas[0] = new Parabola(20,Color.BLACK);
    parabolas[1] = new Parabola(30,Color.BLACK);
    System.out.println(parabolas);
}

    public static void main(String[] args) {
        Test canvas = new Test();
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }}
