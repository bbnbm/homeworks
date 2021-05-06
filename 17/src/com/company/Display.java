package com.company;

public class Display {
    String size;
    String country;
    String typem;

    @Override
    public String toString() {
        return "Display{" +
                "size='" + size + '\'' +
                ", country='" + country + '\'' +
                ", typem='" + typem + '\'' +
                '}';
    }

    public Display(){};

    public Display(String size, String country, String typem) {
        this.size = size;
        this.country = country;
        this.typem = typem;
    }

    public String getSize() {
        return size;
    }

    public String getCountry() {
        return country;
    }

    public String getTypem() {
        return typem;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTypem(String typem) {
        this.typem = typem;
    }
}
