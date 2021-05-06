package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        int sum = 0;
        Student[] student = new Student[3];
        student[0] = new Student("asd", 2,10);
        student[1] = new Student("asd", 3,11);
        student[2] = new Student("asd", 4,12);
        for (int i = 0; i < student.length; i++) {
            sum += student[i].getRate();
        }
        for (Student students : student) {
            sum += students.getRate();
        }*/

        Bread bread = new Bread(1.5,36.6);
        System.out.println(bread);
        FrenchBread frenchBread = new FrenchBread(1.5,20.4,13.4,5.0);
        frenchBread.bake1();
        System.out.println(frenchBread);
        frenchBread.pack1();
    }
}
