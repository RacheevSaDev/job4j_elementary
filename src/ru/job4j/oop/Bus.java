package ru.job4j.oop;

public class Bus implements Vehicle {
    private String name = "Bus";

    @Override
    public void move() {
        System.out.println("Автобус едет по магистрали");
    }

    @Override
    public String toString() {
        return "Bus{" + "name='" + name + '\'' + '}';
    }
}
