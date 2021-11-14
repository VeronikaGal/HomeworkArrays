package com.galeeva.lesson7.homework;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */
public class Task2 {

    public static void main(String[] args) {
        char[] values = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] figures = convertChar(values);
        output(figures);
    }

    public static void output(int[] values) {
        for (int value : values) {
            if (value > findAverage(values)) {
                System.out.print(value + " ");
            }
        }
    }

    public static int findAverage(int[] figures) {
        int sum = 0;
        for (int i = 0; i < figures.length; i++) {
            sum += figures[i];
        }
        sum = sum / figures.length;
        return sum;
    }

    public static int[] convertChar(char[] values) {
        int[] num = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            num[i] = (int) values[i];
        }
        return num;
    }
}
