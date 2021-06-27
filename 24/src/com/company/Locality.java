package com.company;

public abstract class Locality {
    private String major;

    public Locality(){}

    public Locality(String major){
        this.major = major;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }
}
