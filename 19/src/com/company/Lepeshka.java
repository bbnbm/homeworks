package com.company;
public class Lepeshka{
    double weight;
    double price;

    public Lepeshka(double weight, double price) {
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
        System.out.println("Багет готов");
    }
    void pack(){
        System.out.println("Только в экогологичный пакет");
    }

    @Override
    public String toString() {
        return "Lepeshka{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }
}
