package com.company;

import java.awt.*;

public final class Parabola {
    private static int length;
    private static int Y;
    private static Color color;

    public Parabola(int length,Color color) {
        Parabola.length = length;
        Parabola.color = color;
    }


    public static Color getColor() {
        return color;
    }

    public static void setColor(Color color) {
        Parabola.color = color;
    }

    public static int getLength() {
        return length;
    }

    private static void setLength(int length) {
        Parabola.length = length;
    }

    public static int getY() {
        return Y;
    }

    public static void toSolve(){
        Parabola.Y = Parabola.length * 2;
        System.out.println("Значение параболы: " + Parabola.getLength() + " * 2 = " + Parabola.Y);
    }
    public static void toSolve2(){
        Parabola.Y = Parabola.length * 3;
        System.out.println("Значение параболы: " + Parabola.getLength() + " * 3 = " + Parabola.Y);
    }
}
