package by.epam.training.array2;

import java.util.Arrays;

/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Task15 {
    public static void main(String[] args) {
        int m = 7;
        int n = 9;
        int[][] array = getRandomMatrix(m, n, 100);

        System.out.println("Исходная матрица:");
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        // Наибольший элемент матрицы.
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Наибольший элемент = " + max);

        // Замена элементов.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
            }
        }

        System.out.println("Обработанная матрица:");
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    /**
     * Формирует матрицу m*n, заполненную случайными значениями от 0 до k.
     * 
     * @param m - количество строк.
     * @param n - количество столбцов.
     * @param k - максимальное значение элемента.
     */
    private static int[][] getRandomMatrix(int m, int n, int k) {
        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * (k + 1));
            }
        }

        return array;
    }
}
