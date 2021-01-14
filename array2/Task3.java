package by.epam.training2.array2;

import java.util.Arrays;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class Task3 {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;

        int[][] array = new int[m][n];
        array[0] = new int[] { 0, 1, 14, 3, 9 };
        array[1] = new int[] { 4, 5, 6, 7, 2 };
        array[2] = new int[] { 8, 9, 10, 11, 6 };
        array[3] = new int[] { 12, 13, 2, 15, -1 };

        int k = 2;
        int p = 3;

        System.out.println("Строка k(" + k + ") = " + Arrays.toString(array[k - 1]));

        int[] column = new int[m];
        for (int i = 0; i < m; i++) {
            column[i] = array[i][p - 1];
        }

        System.out.println("Столбец p(" + p + ") = " + Arrays.toString(column));
    }
}
