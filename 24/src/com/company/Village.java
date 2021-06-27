package com.company;

public class Village extends Locality{
    public  Village(){

    }

    public Village(String major) {
        super(major);
    }

    @Override
    public  String toString(){
        return "Village{" + "Major = " + getMajor() + "\n" +"}";
    }
}
