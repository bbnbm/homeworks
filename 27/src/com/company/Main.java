package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human human = new Human("first human");
        Ship ship = new Ship("first ship");
        Duck duck = new Duck("first duck");
        Cat cat = new Cat("first cat");
        Parrot parrot = new Parrot("first parrot");
        Shark shark = new Shark("first shark");
        Whale whale = new Whale("first whale");

        Swimable[] swimables = new Swimable[5];
        swimables[0] = human;
        swimables[1] = ship;
        swimables[2] = duck;
        swimables[3] = shark;
        swimables[4] = whale;

        Flyable[] flyables = new Flyable[2];
        flyables[0] = duck;
        flyables[1] = parrot;

        Runable[] runables = new Runable[4];
        runables[0] = human;
        runables[1] = duck;
        runables[2] = cat;
        runables[3] = parrot;

        System.out.println("SwimAble : ");
        for (Swimable swimable: swimables
             ) {
            swimable.swim();
        }
        System.out.println("FlyAble : ");
        for (Flyable flyable: flyables
             ) {
            flyable.fly();
        }
        System.out.println("RunAble : ");
        for (Runable runable:runables
             ) {
            runable.run();
        }
    }
}
/*1. Полиморфизм - это наследование, от родительского класса к дочернему и передача
* свойст родителя к наследнику
* 2.Явное преобразование (кастинг) – это операция, которая преобразует значение одного типа данных в значение другого типа данных.
* 3.Shark, Duck, Turtle выполняют один интерфейс и поэтому они в одном массиве
* 4.Все они должны быть от одного родителя
* 5.Выделяется память для хранения ссылки и указывает адрес ссылки
*  */