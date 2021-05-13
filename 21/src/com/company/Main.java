package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Counter counter = new Counter();
        Counter counter1 = new Counter();
        Counter.increment();
        Counter.increment();
        Counter.increment();
        Counter.factorial();

        Dog dog = new Dog("asd",20,20);
        Dog dog1 = new Dog("asd",20,20);
        System.out.println(Dog.getDogsCount());
    }
}
