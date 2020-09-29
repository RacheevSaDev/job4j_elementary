package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int maxFirstOrSecond = first > second ? first : second;
        int result = maxFirstOrSecond > third ? maxFirstOrSecond : third;
        return result;
    }
}