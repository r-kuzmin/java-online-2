package by.epam.training2.sorting;

import java.util.Arrays;

/**
 * Сортировка обменами. Дана последовательность чисел. Требуется переставить
 * числа в порядке возрастания. Для этого сравниваются два соседних числа. Если
 * нужно, то делается перестановка. Так продолжается до тех пор, пока все
 * элементы не станут расположены в порядке возрастания. Составить алгоритм
 * сортировки, подсчитывая при этом количества перестановок.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[] { 47, 36, 14, 14, 3, 2, 1 };
        int count = 0;
        boolean finish;
        int temp;

        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                    finish = false;
                }
            }
        } while (!finish);

        System.out.println(Arrays.toString(array));
        System.out.println("Всего перестановок: " + count);
    }
}
