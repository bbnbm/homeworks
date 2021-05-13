package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] cash = {500,1000,2000,5000};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму");
        int give = scanner.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int sum12 = cash[0] + cash[1];
        int sum123 = cash[0] + cash[1] + cash[2];
        int sum1234 = cash[0] + cash[1] + cash[2] +cash[3];
        int count12 = 0;
        int count123 = 0;
        int count1234 = 0;
        if (give <= 60000){
            for (int i = 1; sum1 < give; i++) {
                sum1 = sum1 + cash[0];
                count1 = i;
            }
            System.out.printf("SUM1 = %d, COUNT = %d по 500", sum1,count1);
            if (give % cash[1] == 0){
                for (int i = 1; sum2 < give; i++) {
                    sum2 = sum2 + cash[1];
                    count2 = i;
                }
                System.out.printf("\nSUM2 = %d, COUNT = %d  по 1000", sum2,count2);
            }
            if (give % sum12 == 0){
                for (int i = 1; sum12 < give; i++) {
                    sum12 = cash[0] + cash[1];
                    count12 = i;
                }
                System.out.printf("\nSUM12 = %d, COUNT = %d", sum12, count12);
            }
            if (give % cash[2] == 0){
                for (int i = 1; sum3 < give; i++) {
                    sum3 = sum3 + cash[2];
                    count3 = i;
                }
                System.out.printf("\nSUM3 = %d, COUNT = %d по 2000", sum3,count3);
            }
            if (give % cash[3] == 0){
                for (int i = 1; sum4 < give; i++) {
                    sum4 = sum4 + cash[3];
                    count4 = i;
                }
                System.out.printf("\nSUM4 = %d, COUNT = %d по 5000", sum4,count4);
            }
        }else {
            System.out.println("Сумма не должна быть более 60000");
        }
    }
/*    static int cash(int[] money, int given,int sum4, int count4){
        if (given / money[3] == 0){
            for (int i = 0; sum4 < given; i++) {
                sum4 = sum4 + money[3];
                count4 = i;
            }
            System.out.printf("\nSUM4 = %d, COUNT = %d", sum4,count4);
        }
        return  money[3];*/
}
