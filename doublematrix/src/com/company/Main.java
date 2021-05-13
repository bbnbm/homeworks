package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 10;
        int max = 99;
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = random.nextInt(max - min + 1) + min;
                System.out.print(array[i][j] + " ");
            }
        }
        int minValue = array[0][0];
        int maxValue = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i][j] < minValue){
                    minValue = array[i][j];
                }
            }
        }
        System.out.println("Наименьшее " + minValue);
    }
}
