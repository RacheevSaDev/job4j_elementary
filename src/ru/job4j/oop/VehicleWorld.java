package ru.job4j.oop;

public class VehicleWorld {
    public static void main(String[] args) {
        Vehicle airbus320 = new Plane();
        Vehicle boeing777 = new Plane();
        Vehicle tgv = new Train();
        Vehicle euroStar = new Train();
        Vehicle volvo = new Bus();
        Vehicle renault = new Bus();
        Vehicle[] vehiclePark = new Vehicle[6];
        vehiclePark[0] = airbus320;
        vehiclePark[1] = boeing777;
        vehiclePark[2] = tgv;
        vehiclePark[3] = euroStar;
        vehiclePark[4] = volvo;
        vehiclePark[5] = renault;
        for (int i = 0; i < vehiclePark.length; i++) {
            System.out.println(vehiclePark[i].toString());
            vehiclePark[i].move();
        }
    }
}
