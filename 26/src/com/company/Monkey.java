package com.company;

public class Monkey  implements Climb, Eatable,Bringable {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    @Override
    public void bring() {
        System.out.println("I can bring someone");
    }

    @Override
    public void eat() {
        System.out.println("I can eat eatable");
    }

    @Override
    public void climb() {
        System.out.println(" I can climb");
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                '}';
    }

    //////B
    /* 1.Интерфейсы определяют некоторый функционал, не имеющий конкретной реализации, который затем реализуют классы, применяющие эти интерфейсы. И один класс может применить множество интерфейсов.
    2.Гибкость
    3.в интерфейсах могут быть определены статические констант
    4. Interface extends interface
    5.Композиция - один из методов проектирования, используется для повторного использования кода
    6.Механизм, позволяющий создавать класс на основе другого и передачей методов и переменных от родителей
    7.композиция позволяет переиспользовать код без его расширения,наследование при этом требует расширения существующего класса
    * */
}
