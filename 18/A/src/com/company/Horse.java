package com.company;

public class Horse {
    int weight;
    int age;
    String color;
    String sex;
    String name;

    public Horse(){}

    public Horse(int weight, int age, String color, String sex, String name) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.sex = sex;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.out.println("Error");
        }else this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
