package com.company;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Width: , Height");
        System.out.println("Color:");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        String color = scanner.next();

        rectangle.setWidth(width);
        rectangle.setHeight(height);
        rectangle.setColor(color);

        rectangle.setColor("Цвет = " + rectangle.getColor());
        System.out.println("Площадь = " + rectangle.getArea());
        System.out.println("Цвет = " + rectangle.getColor());
    }

}
