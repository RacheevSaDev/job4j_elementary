package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        int deltaXPow2 = (int) Math.pow(deltaX,2);
        int deltaYPow2 = (int) Math.pow(deltaY,2);
        int sumPowOfXY = deltaXPow2 + deltaYPow2;
        return Math.sqrt(sumPowOfXY);
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result1);

        double result2 = Point.distance(3, 0, 0, 4);
        System.out.println("result (3, 0) to (0, 4) " + result2);

        double result3 = Point.distance(1, 1, 8, 9);
        System.out.println("result (1, 1) to (8, 9) " + result3);
    }
}
