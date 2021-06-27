package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        First();

    }
        public static void First(){
            Locality[] localities = new Locality[5];
            localities[0] = new City("Major of city #1", new String[]{"1 district","2 district", "3 district"});
            localities[1] = new City("Major of city #2", new String[]{"4 district","5 district", "6 district"});
            localities[2] = new City("Major of city #3", new String[]{"7 district","8 district", "9 district"});
            localities[3] = new City("Major of village #1", new String[]{"10 district","11 district", "12 district"});
            localities[4] = new City("Major of village #2", new String[]{"13 district","14 district", "15 district"});
            for (Locality city : localities)
                System.out.println(city + "\n");
            Locality leader = searchForMajor(localities,"Major of city #1");
            if (leader != null)
                System.out.println(leader);
            else
                System.out.println("We can't find for this major");
    }
    public static Locality searchForMajor(Locality[] leaders, String key){
        for (Locality leader : leaders)
            if (leader.getMajor().equals(key))
                return leader;
        return null;
    }


    /* QUESTIONS FOR TASK B
        1. Модификатор abstract как и класс необходимы когда реализация не нуждается в объектах,
        но требует создание класса от ООП. К примеру банковская система, сотрудник и клиент будут иметь некоторые общие поля и будут наследоваться
        от класса человек, но для решения задачи не требуется создание объектов для класса человек и имеет смысл сделать этот класс абстрактным
        2.К методам и классам
        3.Для окончательной реализации абстрактного класса и выполнения задач классов наследников
        4.Любая крупная система построена на абстракте, где родительские классы являются абстрактными, а наследники реализуют функционал, как это описано в первом примее
        5.Любой класс с приставкой абстракт, не может иметь объектов. Также, если присутсвует метод с абстракт приставкой, то и этот класс должен быть абстрактным, также невозможна реализация,а только в наследниках
   */

    }

