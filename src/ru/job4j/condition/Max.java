package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean isLeftMax = left > right;
        return isLeftMax ? left : right;
    }

    public static int max(int first, int second, int third) {
        int max2or3 = Max.max(second, third);
        return max(first, max2or3);
    }

    public static int max(int first, int second, int third, int fourth) {
        int max1or2 = Max.max(first, second);
        int max3or4 = Max.max(third, fourth);
        return max(max1or2, max3or4);
    }
}
