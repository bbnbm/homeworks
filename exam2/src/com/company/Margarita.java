package com.company;

public class Margarita extends Pizza {
    private static final String name = "Маргарита";
    private static String type;

    public Margarita(int price, int weight,String type) {
        super(price, weight);
        Margarita.type = type;
    }

    public static String getName() {
        return name;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Margarita.type = type;
    }

    @Override
    public  void bake(){
        System.out.println("Пицца под номером: " + Pizza.count + " готовится");
    }
    @Override
    public void delivery(){
        System.out.println("Пицца доставлена\nНазвание : " + Margarita.getName() + ", Вес " + Margarita.getWeight() + ", Тип пиццы: " + Margarita.getType());
    }
}
