package com.company;

public class Bread implements Bakeable {
    private String name;

    public Bread(String name) {
        this.name = name;
    }

    @Override
    public void bake() {
        System.out.println("We bake bread");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Bread{" +
                "name='" + name + '\'' +
                '}';
    }
}
