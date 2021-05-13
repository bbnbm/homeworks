package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int sum = 0;
        int n = scanner.nextInt();
/*        for (int i = 1;i <= n; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
        System.out.println();*/
/*        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i,2);
            System.out.print(sum + " ");
        }*/
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i,3);
            System.out.print(sum + " ");
        }

    }
}
