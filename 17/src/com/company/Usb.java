package com.company;

public class Usb {
    String type;
    int id;

    public  Usb(){};

    public Usb(String type, int id) {
        this.type = type;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usb{" +
                "type='" + type + '\'' +
                ", id=" + id +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
