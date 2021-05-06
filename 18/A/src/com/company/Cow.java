package com.company;

public class Cow {
    int weight;
    int age;
    String sex;
    String name;

    public Cow(){}
    public Cow(int weight, int age, String sex, String name) {
        this.weight = weight;
        this.age = age;
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
        return "Cow{" +
                "weight=" + weight +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
