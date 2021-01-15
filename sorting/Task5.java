package by.epam.training.sorting;

import java.util.Arrays;

/**
 * Сортировка вставками. Берется следующее число и вставляется в
 * последовательность так, чтобы новая последовательность была тоже
 * возрастающей. Место помещения очередного элемента в отсортированную часть
 * производить с помощью двоичного поиска. Двоичный поиск оформить в виде
 * отдельной функции.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[] { 47, 8, 36, 14, 14, 3, 60, 2, 1 };
        int temp;

        for (int i = 1; i < array.length; i++) {
            int pos = binarySearch(array, array[i], 0, i - 1);

            if (pos < i) {
                temp = array[i];
                for (int j = i - 1; j >= pos; j--) {
                    array[j + 1] = array[j];
                }
                array[pos] = temp;
            } else {
                // pos = i + 1
                // Элемент уже на своём месте.
            }
        }

        System.out.println(Arrays.toString(array));
    }

    /**
     * Бинарный поиск позиции в отсортированном массиве, для которой значения
     * элементов меньше переданного. Если переданное значение меньше любого
     * элемента, возвращается low. Если значение больше максимального, возвращается
     * high + 1.
     * 
     * @param array - упорядоченный массив.
     * @param key   - значение для поиска.
     * @param low   - минимальный индекс массива, начиная с которого нужно искать.
     * @param high  - максимальны индекс массива, до которого нужно искать.
     * @return - возвращает -1 в случае ошибочных параметров.
     */
    private static int binarySearch(int[] array, int key, int low, int high) {
        int index = -1;
        int mid;

        if (array.length == 0 || low > high) {
            return index;
        }

        while (low <= high) {
            if (high - low <= 1) {
                // Для случая, когда диапазон поиска сошелся до 1 или 2 элементов.
                if (key <= array[low]) {
                    index = low;
                    break;
                } else if (key >= array[high]) {
                    index = high + 1;
                    break;
                } else {
                    index = high;
                    break;
                }
            }

            mid = (low + high) >>> 1;

            if (array[mid] < key) {
                low = mid;
            } else if (array[mid] > key) {
                high = mid;
            } else if (array[mid] == key) {
                index = mid;
                break;
            }
        }

        return index;
    }
}
