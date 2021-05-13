package com.company;

public class Brain {
    String model;
    int count;
    int cpu;

    public Brain(String model, int count, int cpu) {
        this.model = model;
        this.count = count;
        this.cpu = cpu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "Brain{" +
                "model='" + model + '\'' +
                ", count=" + count +
                ", cpu=" + cpu +
                '}';
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }
}
