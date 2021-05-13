package com.company;
public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] array = {'р','а','б','о','т','а','н','е','в','о','л','к'};
        char[] check = new char[array.length];
        boolean checkout = true;
        for (int i = 0; i < array.length; i++) {
            checkout = true;
            for (int j = 0; j < array.length; j++) {
                if ( array[i] == array[j] && i != j){
                    checkout = false;
                    break;
                }
            }
            if (checkout) check[i] = array[i];
        }
        for (int i = 0; i < check.length; i++) {
            System.out.print(check[i]);
        }
    }

}
