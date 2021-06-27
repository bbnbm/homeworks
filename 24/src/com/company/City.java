package com.company;

import java.util.Arrays;

public class City extends Locality{
    private String[] district;

    public City(String[] district) {
        this.district = district;
    }

    public City(String major, String[] district) {
        super(major);
        this.district = district;
    }

    @Override
    public String toString() {
        return "City{" +
                "Major = " + getMajor() + "\n"
                +
                "district = " + Arrays.toString(district) +
                '}';
    }
}
