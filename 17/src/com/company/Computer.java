package com.company;

import java.util.Arrays;

public class Computer {
    Display display;
    String mark;
    String color;
    HardDisk hardDisk;
    Operative operative;
    String videoCard;
    Usb[] Usb;
    Keyboard keyboard;

    @Override
    public String toString() {
        return "Computer{" +
                "display=" + display +
                ", mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", hardDisk=" + hardDisk +
                ", operative=" + operative +
                ", videoCard='" + videoCard + '\'' +
                ", Usb=" + Arrays.toString(Usb) +
                ", keyboard=" + keyboard +
                '}';
    }

    public Computer(){
        this.mark = "asd";
        this.color = "black";
        this.videoCard = "GeForce";
    }

    public Computer(Display display, String mark, String color, HardDisk hardDisk, Operative operative, String videoCard, com.company.Usb[] usb, Keyboard keyboard) {
        this.display = display;
        this.mark = mark;
        this.color = color;
        this.hardDisk = hardDisk;
        this.operative = operative;
        this.videoCard = videoCard;
        Usb = usb;
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public String getMark() {
        return mark;
    }

    public String getColor() {
        return color;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public Operative getOperative() {
        return operative;
    }

    public String getVideocard() {
        return videoCard;
    }

    public com.company.Usb[] getUsb() {
        return Usb;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setOperative(Operative operative) {
        this.operative = operative;
    }

    public void setVideocard(String videocard) {
        this.videoCard = videocard;
    }

    public void setUsb(com.company.Usb[] usb) {
        Usb = usb;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
