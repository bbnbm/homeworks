package com.company;

public class Rectangle {
    int width;
    int height;
    int area;
    String color;
    public void setWidth(int w) {
        if (w <= 0) {
            System.err.println("Нельзя задавать отрицательое знач");
        } else {
            width = w;
            System.out.println("Одобрено");
        }

    }
    public void setHeight(int h) {
        if (h <= 0) {
            System.err.println("Нельзя задавать отрицательое знач");
        } else {
            height = h;
            System.out.println("Одобрено");
        }
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public int getArea(){
        area =  height * width;
        return area;
    }
}
