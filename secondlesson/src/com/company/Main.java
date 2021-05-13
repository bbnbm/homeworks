package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Scanner scanner = new Scanner(System.in);
        /*Random random = new Random();
        System.out.println("Введите коориданаты для A: ");
        double ax = scanner.nextDouble();
        double ay = scanner.nextDouble();
        System.out.println("Введите координаты для B: ");
        double bx = scanner.nextDouble();
        double by = scanner.nextDouble();
        double ab;
        ab = Math.sqrt(Math.pow(ax - bx, 2)) + Math.pow(ay - by, 2);
        System.out.println(ab);
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет, как тебя зовут?");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name);
        System.out.println("Какого ты года?");
        int age = scanner.nextInt();
        System.out.println("Вам " + (2021 - age));

    }
}
