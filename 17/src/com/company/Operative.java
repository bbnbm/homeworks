package com.company;

public class Operative {
    int volume;
    String country;

    public Operative(){};
    public Operative(int volume, String country) {
        this.volume = volume;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Operative{" +
                "volume=" + volume +
                ", country='" + country + '\'' +
                '}';
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
