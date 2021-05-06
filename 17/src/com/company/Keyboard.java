package com.company;

import java.util.Arrays;

public class Keyboard {
    String[] array;
    boolean color;
    boolean extra;
    public  Keyboard(){};

    public Keyboard(String[] array, boolean color, boolean extra) {
        this.array = array;
        this.color = color;
        this.extra = extra;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "array=" + Arrays.toString(array) +
                ", color=" + color +
                ", extra=" + extra +
                '}';
    }
}
