package by.epam.training.array2;

import java.util.Arrays;

/**
 * Сформировать квадратную матрицу порядка N по правилу и подсчитать количество
 * положительных элементов в ней.
 */
public class Task7 {
    public static void main(String[] args) {
        int n = 6;
        double[][] array = new double[n][n];
        double a, powI, powJ;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                powI = Math.pow(i + 1, 2);
                powJ = Math.pow(j + 1, 2);
                a = Math.sin((powI + powJ) / n);

                array[i][j] = a;

                if (a > 0) {
                    count++;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println("Количество положительных = " + count);
    }
}
