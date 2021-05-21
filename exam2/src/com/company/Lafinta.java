package com.company;

public class Lafinta extends Pizza {
    private static final String name = "Ла Финта";
    private static String type;

    public Lafinta(int price, int weight,String type) {
        super(price, weight);
        Lafinta.type = type;
    }

    public static String getName() {
        return name;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Lafinta.type = type;
    }
    @Override
    public  void bake(){
        System.out.println("Пицца под номером: " + Pizza.count + " готовится");
    }
    @Override
    public void delivery(){
        System.out.println("Пицца доставлена\nНазвание : " + Lafinta.getName() + ", Вес " + Lafinta.getWeight() + ", Тип пиццы: " + Lafinta.getType());
    }
}
