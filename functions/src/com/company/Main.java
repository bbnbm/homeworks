package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int result = getCountedSum(num);
        if (result > 10){
            System.out.println("Число больше 10");
        }else {
            System.out.println(result);}
        }
    static int getCountedSum(int a){
        int result = 0;
        while (a > 0){
            result = result + a % 10;
            a = a / 10;
        }
        return result;
    }*/
        /*/Scanner scanner = new Scanner(System.in);
        /*System.out.println("Введите валюту");
        String rate = scanner.next();
       */
        /* System.out.println(getRate(rate));*/
       /* System.out.println(doSomething(1));*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Валюта? ");
        String currency = scanner.next();
        System.out.println("Сколько? ");
        double sum = scanner.nextInt();
        System.out.println("Покупка? ");
        boolean sell = true;
        boolean buy = false;
        getRatebuy(currency,sum,buy);
        g
    }
    static double getRatebuy(String currenCode, double sum, boolean yes) {
        double rate = sum;
        if (yes){
        switch (currenCode) {
            case "USD": rate = 70;break;
            case "KGS": rate = 20;break;

            default:rate = 0;
        }
        }
        return rate;
    }
    static double getRatesell(String currenCode, double sum, boolean no) {
        double rate = sum;
        if (no){
            switch (currenCode) {
                case "USD": rate = 69;break;
                case "KGS": rate = 19;break;

                default:rate = 0;
            }
        }
        return rate;
    }
/*    static int doSomething(int num){
        if (num < 10){
            return num;
        }
        System.out.println("Hello");
        return 0;
    }*/

}
