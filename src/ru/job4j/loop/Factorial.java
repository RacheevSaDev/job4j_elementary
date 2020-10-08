package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n < 0) {
            System.out.println("Факториал от " + n + " не существует");
        }
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}