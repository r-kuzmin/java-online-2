package by.epam.training.array;

import java.util.Arrays;

/**
 * Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее
 * члены, большие данного Z, этим числом. Подсчитать количество замен.
 */
public class Task2 {
    public static void main(String[] args) {
        double[] array = new double[] {45.0, 45.5, 46.0, 46.5, 47.0, 47.5};
        double z = 46.0;
        int k = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                k++;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Replaced " + k);
    }
}
