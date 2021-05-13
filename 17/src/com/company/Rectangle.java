package com.company;

public class Rectangle {
    int height;
    int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    public void setHeight(int height){
        if (height <= 0){
            System.out.println("error");
        }else this.height = height;
    }
    public void  setWidth(int width){
        if (width <= 0){
            System.out.println("error");
        }else this.width = width;
    }

    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public String toString(){
        return String.format("width = %d, height = %d",
        this.height,this.width);
    }
}
