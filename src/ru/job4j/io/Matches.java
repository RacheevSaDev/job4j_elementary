package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        int minusMin = 1;
        int minusMax = 3;

        Scanner input = new Scanner(System.in);
        int step = 0;
        while (matches > 0) {
            System.out.println("Очередь игрока " + calcPlayerNumber(step));
            System.out.println("Сейчас " + matches + " спичек");
            System.out.println("Сколько спичек уберёте от " + minusMin + " до " +  minusMax + " ?");
            int matchesForMinus = Integer.valueOf(input.nextLine());
            while (!(minusMin <= matchesForMinus && matchesForMinus <= minusMax && matches - matchesForMinus >= 0)) {
                System.out.println("Не корректное значение. Попробуйте ещё раз:");
                matchesForMinus = Integer.valueOf(input.nextLine());
            }
            matches -= matchesForMinus;
            step++;
        }
        System.out.println("Игра окончена!");
        System.out.println("Победил игрок " + calcPlayerNumber(step - 1));
    }

    private static int calcPlayerNumber(int step) {
        return step % 2 + 1;
    }
}
