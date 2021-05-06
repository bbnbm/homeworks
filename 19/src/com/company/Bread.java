package com.company;

public class Bread {
    double weight;
    double price;

    public Bread(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void bake(){
        System.out.println("Хлеб готов");
    }
    void pack(){
        System.out.println("Упаковали");
    }

    @Override
    public String toString() {
        return "Bread{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }
}
