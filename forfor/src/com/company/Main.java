package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*int[][] flats = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++ ){
                System.out.printf("flats[%s][%s] = %s\n",i,j,flats[i][j]);
            }
        }*/
        Random random = new Random();
        int min = 1;
        int max = 9;
        int [][] array = new int[3][3];
        int sum = 0;
        int count = array.length * array[0].length;
        for (int i = 0; i <array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(max - min + 1) + min;
                sum = sum + array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println(sum / count + " арифмет");
    }
}
