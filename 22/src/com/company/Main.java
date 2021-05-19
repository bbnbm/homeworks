package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code
        Credit credit1 = new Credit(1,2000,20,15.5);
        Credit credit2 = new Credit(2,3000,25,16.5);
        Credit credit3 = new Credit(3,4000,30,17.5);


        int sum = 0;
        sum = sum + credit1.getSum() + credit2.getSum() + credit3.getSum();
        int average = sum / Credit.counter;


        System.out.println("Количество кредитов = " + Credit.counter);
        System.out.println("Общая сумма = " + sum);
        System.out.println("Среднее значение кредитов = " + average);
        }

}
