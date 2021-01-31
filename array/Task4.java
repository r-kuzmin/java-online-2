package by.epam.training.array;

import java.util.Arrays;

/**
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
 * наименьший элементы.
 */
public class Task4 {
    public static void main(String[] args) {
        double[] array = new double[] { -77.45, -100.1, -30.0, 0, 0, 0.001, 1, 2, 33.5 };

        int iMin = 0;
        int iMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[iMin]) {
                iMin = i;
            } else if (array[i] > array[iMax]) {
                iMax = i;
            }
        }

        double temp = array[iMin];
        array[iMin] = array[iMax];
        array[iMax] = temp;

        System.out.println(Arrays.toString(array));
    }
}
