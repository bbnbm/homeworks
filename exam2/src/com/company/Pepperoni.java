package com.company;

import java.time.Period;

public class Pepperoni extends Pizza {
    private  static final String name = "Пепперони";
    private static String type;

    public Pepperoni(int price, int weight, String type) {
        super(price, weight);
        Pepperoni.type = type;

    }

    public static String getName() {
        return name;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Pepperoni.type = type;
    }
    @Override
    public  void bake(){
        System.out.println("Пицца под номером: " + Pizza.count + " готовится");
    }
    @Override
    public void delivery(){
        System.out.println("Пицца доставлена\nНазвание : " + Pepperoni.getName() + ", Вес " + Pepperoni.getWeight() + ", Тип пиццы: " + Pepperoni.getType());
    }

}
