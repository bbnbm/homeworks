package com.company;

public class Counter {
    private static int numOfCalls;

    public Counter(){
        numOfCalls++;
    }
    public static int getNumOfCalls(){
        return getNumOfCalls();
    }

    public static void increment(){
        numOfCalls++;
        System.out.println(numOfCalls);
    }
    public static int factorial(){
        int factorial = 1;
        for(int i = 1; i <= numOfCalls; i++){
            factorial *= i;
        }
        System.out.println("factorial = " + factorial);
        return factorial;
    }
}
