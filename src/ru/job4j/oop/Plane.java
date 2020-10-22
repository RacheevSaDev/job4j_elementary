package ru.job4j.oop;

public class Plane implements Vehicle {
    private String name = "Plane";

    @Override
    public void move() {
        System.out.println("Самолёт летит");
    }

    @Override
    public String toString() {
        return "Plane{" + "name='" + name + '\'' + '}';
    }
}
