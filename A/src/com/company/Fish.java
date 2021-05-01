package com.company;

public class Fish {
    String type;
    String color;
    int age;
    int weight;

    public void setType(String predator){
        this.type = predator;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void  setAge (int age){
        if (age <= 0){
            System.out.println("Нельзя задавать отрицательные значения");
        }else this.age = age;
    }
    public void setWeight (int weight){
        this.weight = weight;
    }

    public String getType(){
        return this.type;
    }
    public String getColor(){
        return this.color;
    }
    public int getAge(){
        return this.age;
    }
    public int getWeight(){
        return this.weight;
    }
}
