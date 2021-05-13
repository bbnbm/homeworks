package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle square = new Rectangle(10,11);
        System.out.println(square);
        square.setWidth(1);
        square.setHeight(10);
        System.out.println(square.getWidth());
        System.out.println(square.getHeight());
    }
}
