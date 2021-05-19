package com.company;

public class Credit {
    public static int counter = 0;
    private  int id;
    private  int sum;
    private int period;
    private double procent;


    public Credit(int id, int sum, int period, double procent) {
        this.id = id;
        this.sum = sum;
        this.period = period;
        this.procent = procent;
        counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getProcent() {
        return procent;
    }

    public void setProcent(double procent) {
        this.procent = procent;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "id=" + id +
                ", sum=" + sum +
                ", period=" + period +
                ", procent=" + procent +
                '}';
    }


}
