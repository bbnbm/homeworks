package com.company;

public class Task {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Fish fish1 = new Fish();
        Fish fish2 = new Fish();
        bird1.setType("blue");
        bird1.setColor("red");
        bird1.setAge(-1);
        bird1.setWeight(4);

        bird2.setType("Predator");
        bird2.setColor("black");
        bird2.setAge(10);
        bird2.setWeight(10);

        dog1.setType("Retriever");
        dog1.setColor("gold");
        dog1.setAge(5);
        dog1.setWeight(20);

        dog2.setType("German");
        dog2.setColor("black");
        dog2.setAge(12);
        dog2.setWeight(30);


        cat1.setType("Egyptian");
        cat1.setColor("bold");
        cat1.setAge(8);
        cat1.setWeight(10);

        cat2.setType("Garfield");
        cat2.setColor("Gold");
        cat2.setAge(12);
        cat2.setWeight(25);

        fish1.setType("Shark");
        fish1.setColor("blue");
        fish1.setAge(20);
        fish1.setWeight(500);

        fish2.setType("Whale");
        fish2.setColor("Blue");
        fish2.setAge(50);
        fish2.setWeight(2000);

        System.out.printf("%s, %s, %d years, %d",bird1.getType(),bird1.getColor(),bird1.getAge(),bird1.getWeight());
        System.out.printf("\n%s, %s, %d years, %d",bird2.getType(),bird2.getColor(),bird2.getAge(),bird2.getWeight());
        System.out.printf("\n%s, %s, %d years, %d",dog1.getType(),dog1.getColor(),dog1.getAge(),dog1.getWeight());
        System.out.printf("\n%s, %s, %d years, %d",dog2.getType(),dog2.getColor(),dog2.getAge(),dog2.getWeight());
        System.out.printf("\n%s, %s, %d years, %d",cat1.getType(),cat1.getColor(),cat1.getAge(),cat1.getWeight());
        System.out.printf("\n%s, %s, %d years, %d",cat2.getType(),cat2.getColor(),cat2.getAge(),cat2.getWeight());
        System.out.printf("\n%s, %s, %d years, %d",fish1.getType(),fish1.getColor(),fish1.getAge(),fish1.getWeight());
        System.out.printf("\n%s, %s, %d years, %d",fish2.getType(),fish2.getColor(),fish2.getAge(),fish2.getWeight());
    }

}
