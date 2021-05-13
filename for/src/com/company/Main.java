package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:a ");
      *//*  int n = scanner.nextInt();
        for (int i = 0; i < 11; i++) {
            int res = n * i;
            System.out.println(res);
        }*//*
        int a = scanner.nextInt();
        System.out.println("Введите число: b");
        int b = scanner.nextInt();
        int sum = 0;
        for (; a <= b; a++){
            if (a % 2 != 0){
                sum +=a;
            }
        }
        System.out.println(sum);*/
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        for (;;) {
            System.out.println("Введите число");
            int num = scanner.nextInt();
            sum = sum + num;
            count++;
            if (num == 0) break;
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифмет: " + (float)sum / 2);
    }
}
