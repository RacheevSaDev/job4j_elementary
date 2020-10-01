package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double fullCredit = amount;
        while (fullCredit > 0) {
            fullCredit = fullCredit + fullCredit * percent / 100;       // сумма, которая набежала за этот год
            fullCredit = fullCredit - salary;                           // сумма после уплаты платежа за год
            year++;                                                     // прибавляем год, по окончанию
        }
        return year;
    }
}