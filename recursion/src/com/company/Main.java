package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("num = " + getSum(6));
    }
    static int getSum(int n){
        if (n == 0)return 0;
        //return n + getSum(n - 1);
        //sum = n%10 + getSum(n/10);
        //return n * getSum(n - 1);
        if (n == 1) return 1;
        int sum = 0;
        return getSum(n - 1) + getSum(n - 2);
    }
}
