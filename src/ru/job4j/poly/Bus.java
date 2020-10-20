package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Едем!!!");
    }

    @Override
    public void takePassengers(int number) {
        System.out.println("Взяли " + number + " пассажиров");
    }

    @Override
    public double refuel(int fuel) {
        double price = 42.5;
        return fuel * price;
    }
}
