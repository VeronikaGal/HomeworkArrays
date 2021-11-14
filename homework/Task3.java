package com.galeeva.lesson7.homework;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других:
 * с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 */
public class Task3 {

    public static void main(String[] args) {
        int[] values = {-4, 6, 1, 9, 5, -18, 3, 0};
        int[][] result = sort(values);
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] sort(int[] values) {
        int[][] result = new int[3][];
        result[0] = new int[positive(values)];
        result[1] = new int[negative(values)];
        result[2] = new int[zero(values)];
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        for (int value : values) {
            if (value > 0) {
                result[0][index1++] = value;
            } else if (value < 0) {
                result[1][index2++] = value;
            } else {
                result[2][index3++] = value;
            }
        }
        return result;
    }

    public static int positive(int[] values) {
        int size = 0;
        for (int value : values) {
            if (value > 0) {
                size++;
            }
        }
        return size;
    }

    public static int negative(int[] values) {
        int size = 0;
        for (int value : values) {
            if (value < 0) {
                size++;
            }
        }
        return size;
    }

    public static int zero(int[] values) {
        int size = 0;
        for (int value : values) {
            if (value == 0) {
                size++;
            }
        }
        return size;
    }
}
