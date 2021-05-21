package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double y = 0;
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(3);
        Circle circle4 = new Circle(4);
        Circle circle5 = new Circle(5);
        Circle circle6 = new Circle(6);
        Circle circle7 = new Circle(7);
        Circle circle8 = new Circle(8);
        Circle circle9 = new Circle(9);
        Circle circle10 = new Circle(10);

        Circle[] circles = {circle1,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9,circle10};

        int count = 0;
        for (Circle circle : circles) {
            y = (circle.getRadius() * Circle.getP() * 2);
            if (y / 3 == 0){
                count++;
                System.out.println("Количество =  " + count);
            }
            System.out.println("Площадь круга  = " + y);
        }

    }
}
