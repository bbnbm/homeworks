package com.company;

public class Notebook {
    Hdd hdd;
    Om om;
    Os os;
    Brain brain;


    public Notebook(){};

    public Notebook(Hdd hdd, Om om, Os os, Brain brain) {
        this.hdd = hdd;
        this.om = om;
        this.os = os;
        this.brain = brain;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Om getOm() {
        return om;
    }

    public void setOm(Om om) {
        this.om = om;
    }

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }


    @Override
    public String toString() {
        return "Notebook{" +
                "hdd=" + hdd +
                ", om=" + om +
                ", os=" + os +
                ", brain=" + brain +
                '}';
    }
}
