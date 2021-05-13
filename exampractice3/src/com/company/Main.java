package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш год рождения: ");
        int age = scanner.nextInt();
        System.out.println(age);
        int sum = 2021 - age;
        System.out.println("Your age is: " + sum);
        leapYear(age);
    }
    static void leapYear(int check){
        if (check % 4 != 0) {
            System.out.println("Common year");
        }else if (check % 100 != 0) {
            System.out.println("Leap year");
        }else if (check % 400 == 0 && check % 100 == 0){
            System.out.println("Leap year");
        }else System.out.println("Leap year");
    }
}
