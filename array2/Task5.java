package by.epam.training.array2;

import java.util.Arrays;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).
 */
public class Task5 {
    public static void main(String[] args) {
        int n = 6;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + i < n) {
                    array[i][j] = i + 1;
                } else {
                    array[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
