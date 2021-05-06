package com.company;

import java.util.Arrays;

public class Farm {
    String address;
    Cow[] cows;
    Ship[] ships;
    Horse[] horses;
    String bio;


    public Farm(){};
    public Farm(String address, Cow[] cows, Ship[] ships, Horse[] horses, String bio) {
        this.address = address;
        this.cows = cows;
        this.ships = ships;
        this.horses = horses;
        this.bio = bio;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Ship[] getShips() {
        return ships;
    }

    public void setShips(Ship[] ships) {
        this.ships = ships;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(this.cows) + "Количество коров = " + this.cows.length +
                ", ships=" + Arrays.toString(this.ships) + "Количество овец = " + this.ships.length +
                ", horses=" + Arrays.toString(horses) + "Количество лошадей = " + this.horses.length +
                ", bio='" + bio + '\'' +
                '}';
    }
}
