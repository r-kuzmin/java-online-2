package by.epam.training.sorting;

import java.util.Arrays;

/**
 * Сортировка Шелла.
 */
public class Task6 {
    public static void main(String[] args) {
        double[] array = new double[] { 47.0, 8.0, 36.5, -14.1, 14.06, 3.7, 60, 2, -1 };

        // По условию задачи, сразу используется шаг = 1. В общем случае
        // это не обязательно должно быть так.
        int step = 1;

        shellSort(array, step);

        System.out.println(Arrays.toString(array));
    }

    /**
     * Сортировка элементов массива алгоритмом Шелла с указанным стартовым
     * расстоянием. https://ru.wikipedia.org/wiki/Сортировка_Шелла
     * 
     * @param array - исходный массив.
     * @param step  - расстояние для сравниваемых элементов.
     */
    private static void shellSort(double[] array, int step) {
        for (; step > 0; step /= 2) {
            insertionSort(array, step);
        }
    }

    /**
     * Сортировка элементов массива вставками с указанием шага между элементами. В
     * случае шага равного 1, вырождается в стандартный алгоритм сортировки
     * вставками. https://ru.wikipedia.org/wiki/Сортировка_вставками
     * 
     * @param array - исходный массив.
     * @param step  - расстояние для сравниваемых элементов.
     */
    private static void insertionSort(double[] array, int step) {
        double tmp;

        for (int i = step; i < array.length; i++) {
            for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                tmp = array[j];
                array[j] = array[j + step];
                array[j + step] = tmp;
            }
        }
    }
}
