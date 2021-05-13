package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 3 == 0){
                sum3 += i;
            }
            if (i % 4 == 0){
                sum4 += i;
            }
        }
        int sum = sum3 - sum4;
        System.out.printf("\nСумма чисел кратных 3 = %d",sum3);
        System.out.printf("\nСумма чисел кратных 4 = %d",sum4);
        System.out.printf("\n%d - %d = %d",sum3,sum4,sum);
    }
}
