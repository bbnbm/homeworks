package com.company;

public class AbstractClass {
    private String name;

    public AbstractClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AbstractClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
