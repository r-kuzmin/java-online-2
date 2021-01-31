package by.epam.training.sorting;

import java.util.Arrays;

/**
 * Сортировка выбором. Дана последовательность чисел.Требуется переставить
 * элементы так, чтобы они были расположены по убыванию. Для этого в массиве,
 * начиная с первого, выбирается наибольший элемент и ставится на первое место,
 * а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 14, 14, 36, 47 };

        for (int i = 0; i < array.length; i++) {
            int idx = i;
            int max = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    idx = j;
                }
            }

            if (max > array[i]) {
                array[idx] = array[i];
                array[i] = max;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
