package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {                           // последний элемент не с чем менять
            int min = MinDiapason.findMin(data, i, data.length-1);      // находим минимальное значение в диапазоне
            int index = FindLoop.indexOf(data, min, i, data.length-1);  // индекс минимального значения
            if (min < data[i]) {                                              // меняем значения если минимум меньше
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
        }
        return data;
    }
}