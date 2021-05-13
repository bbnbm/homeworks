package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hdd hdd = new Hdd(10,10);
        Om om = new Om(10,10);
        Os os = new Os("name",3.0);
        Brain brain = new Brain("asus", 4,5);
        Hdd hdd1 = new Hdd(100,200);
        Os os1 = new Os("Ubuntu", 16.04);
        Notebook notebook = new Notebook(hdd,om,os,brain);


        System.out.println(notebook);
    }
}
