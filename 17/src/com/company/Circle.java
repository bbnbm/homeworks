package com.company;

public class Circle{
    double radius;
    String color;
    boolean transparent;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setTransparent(boolean transparent){
        this.transparent = transparent;
    }

    public double getLength(){
        return 2 * 3.14 * this.radius;
    }
    public Circle(double radius){
       this.radius = radius;
       transparent = true;
    }
    public String toString(){
        return String.format("%f, %s, %b", this.radius, this.color, this.transparent);
    }

}
