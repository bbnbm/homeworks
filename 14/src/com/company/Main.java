package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal wolf = new Animal();
        wolf.view = "ugly";
        Animal sheep = new Animal();
        sheep.view = "ugly";
        System.out.println(sheep.view + ", " + wolf.view);
    }
}
