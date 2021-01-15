package by.epam.training.array2;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int n = 8;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i < n / 2) {
                    if (j < n / 2) {
                        array[i][j] = (i <= j) ? 1 : 0;
                    } else {
                        array[i][j] = (i + j < n) ? 1 : 0;
                    }
                } else {
                    if (j < n / 2) {
                        array[i][j] = (i + j >= n - 1) ? 1 : 0;
                    } else {
                        array[i][j] = (i >= j) ? 1 : 0;
                    }
                }

            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
