package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Display display = new Display("128","samsung","ips");
        HardDisk hardDisk = new HardDisk(16,2);
        Operative operative = new Operative(32,"China");
        Usb usb = new Usb("3.0",2);
        Usb[] usbArray = new Usb[1];
        usbArray[0] = usb;
        Keyboard keyboard = new Keyboard(new String[]{"1,2,3"},false,false);
        Computer computer = new Computer(display,"asus","black",hardDisk,operative,"geforce",usbArray,keyboard);
        display.setSize("128");
        display.setCountry("samsung");
        display.setTypem("ips");
        hardDisk.setMemorysize(16);
        hardDisk.setCountd(2);
        operative.setVolume(32);
        operative.setCountry("China");
        usb.setType("3.0");
        usb.setId(2);
        System.out.println(computer);
    }
}
