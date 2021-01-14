package by.epam.training2.array;

import java.util.Arrays;

/**
 * Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из
 * него каждый второй элемент (освободившиеся элементы заполнить нулями).
 * Примечание. Дополнительный массив не использовать.
 */
public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // Индекс элемента, после которого д. б. нули.
        int limit;
        if (array.length % 2 == 0) {
            limit = array.length / 2;
        } else {
            limit = array.length / 2 + 1;
        }

        // Перестраиваем массив.
        for (int i = 1; i < array.length; i++) {
            if (i < limit) {
                for (int j = i + 1; j < array.length - i + 1; j += 2) {
                    array[j - 1] = array[j];
                }
            } else {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
