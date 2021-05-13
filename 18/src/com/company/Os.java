package com.company;

public class Os {
    String name;
    double version;

    public Os(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "OS{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
