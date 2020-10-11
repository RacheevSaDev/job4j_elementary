package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean isLeftMax = left > right;
        return isLeftMax ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(first, Max.max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(Max.max(first, second), Max.max(third, fourth));
    }
}
