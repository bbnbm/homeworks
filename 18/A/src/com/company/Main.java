package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cow cow1 = new Cow(10,12,"male","cow1");
        Cow cow2 = new Cow(9,11,"female","cow2");
        Cow cow3 = new Cow(8,10,"male","cow3");
        Cow cow4 = new Cow(7,9,"female","cow4");
        Cow cow5 = new Cow(6,8,"male","cow5");

        Ship ship1 = new Ship(15,15,"male","ship1");
        Ship ship2 = new Ship(14,14,"male","ship2");
        Ship ship3 = new Ship(13,13,"male","ship3");

        Horse horse1 = new Horse(50,3,"black","male","horse1");
        Horse horse2 = new Horse(40,2,"white","female","horse2");

        Cow[] cows = new Cow[5];
        cows[0] = cow1;
        cows[1] = cow2;
        cows[2] = cow3;
        cows[3] = cow4;
        cows[4] = cow5;

        Ship[] ships = new Ship[3];
        ships[0] = ship1;
        ships[1] = ship2;
        ships[2] = ship3;

        Horse[] horses = new Horse[2];
        horses[0] = horse1;
        horses[1] = horse2;

        Cow[] cows1 = new Cow[1];
        cows1[0] = cow1;

        Ship[] ships1 = new Ship[1];
        ships1[0] = ship1;

        Horse[] horses1 = new Horse[1];
        horses1[0] = horse1;

        Farm farm1 = new Farm("Address",cows,ships,horses,"bio");
        Farm farm2 = new Farm("newAddress",cows1,ships1,horses1,"newBio");
        System.out.println(farm1);
        System.out.println(farm2);
    }
}
