package com.company;

public class Student {
    String bio;
    int age;
    int rate;

    public Student(String bio, int age, int rate) {
        this.bio = bio;
        this.age = age;
        this.rate = rate;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "bio='" + bio + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                '}';
    }
}
