package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int j = 0;
        int k = 0;
        while (j < left.length && k < right.length) {
            if (left[j] < right[k]) {
                rsl[j + k] = left[j];
                j++;
            } else {
                rsl[j + k] = right[k];
                k++;
            }
        }
        if (!(j < left.length)) {
            System.arraycopy(right, k, rsl, j + k, right.length - k);
        }
        if (!(k < right.length)) {
            System.arraycopy(left, j, rsl, j + k, left.length - j);
        }
        return rsl;
    }
}