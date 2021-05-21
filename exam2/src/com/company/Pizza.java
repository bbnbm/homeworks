package com.company;

public class Pizza {
    private static int price;
    private static int weight;
    public static int count;

    public Pizza(int price, int weight) {
        Pizza.price = price;
        Pizza.weight = weight;
        count++;
    }

    public static int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        Pizza.price = price;
    }

    public static int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        Pizza.weight = weight;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }
    public void delivery(){
        System.out.println(Pizza.getPrice() + Pizza.getWeight());
    }
    public void bake(){
        System.out.println("Пицца под номером: " + Pizza.count + " готовится");
    }


}
