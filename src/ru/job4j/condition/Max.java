package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean isLeftMax = left > right;
        return isLeftMax ? left : right;
    }
}