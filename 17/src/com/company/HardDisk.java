package com.company;

public class HardDisk {
    int memorysize;
    int countd;

    public HardDisk(){};

    public HardDisk(int memorysize, int countd) {
        this.memorysize = memorysize;
        this.countd = countd;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "memorysize=" + memorysize +
                ", countd=" + countd +
                '}';
    }

    public int getMemorysize() {
        return memorysize;
    }

    public void setMemorysize(int memorysize) {
        this.memorysize = memorysize;
    }

    public int getCountd() {
        return countd;
    }

    public void setCountd(int countd) {
        this.countd = countd;
    }
}
