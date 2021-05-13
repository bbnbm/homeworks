package com.company;

public class FrenchBread extends Bread {
    double length;
    double rubCy;

    public FrenchBread(double weight, double price, double length, double rubCy) {
        this(weight,price);
        this.length = length;
        this.rubCy = rubCy;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getRubCy() {
        return rubCy;
    }

    public void setRubCy(double rubCy) {
        this.rubCy = rubCy;
    }

    public FrenchBread(double weight, double price) {
        super(weight, price);
    }
    public void rubCevat(){
        System.out.println("Зарубцевали");
    }

    void bake1(){
        rubCevat();
        System.out.println("Багет готов");
    }
    void pack1(){
        System.out.println("Только в экогологичный пакет");
    }
    @Override
    public String toString() {
        return "FrenchBread{" +
                "weight=" + weight +
                ", price=" + price +
                ", length=" + length +
                ", rubCy=" + rubCy +
                '}';
    }
}
