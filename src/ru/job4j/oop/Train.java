package ru.job4j.oop;

public class Train implements Vehicle {
    private String name = "Train";

    @Override
    public void move() {
        System.out.println("Поезд едет по рельсам");
    }

    @Override
    public String toString() {
        return "Train{" + "name='" + name + '\'' + '}';
    }
}
