package com.galeeva.lesson7.homework;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала
 */
public class Task1 {

    public static void main(String[] args) {
        int[] values = {8, 6, 9, -4, 54, 35, -87, 43, 0, 54, -6};
        int[] result = removeNegative(values);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeNegative(int[] values) {
        int[] positive = new int[index(values)];
        int k = 0;
        for (int value : values) {
            if (value >= 0) {
                positive[k++] = value * positive.length;
            }
        }
        return positive;
    }

    private static int index(int[] values) {
        int size = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                size++;
            }
        }
        return size;
    }
}
