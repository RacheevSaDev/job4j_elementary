package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        // проверка на делимость. Достаточно проверять до корня из числа
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                prime = false;         // далее не имеет смысла проверять. Число не является простым
                break;
            }
        }
        return prime;
    }
}