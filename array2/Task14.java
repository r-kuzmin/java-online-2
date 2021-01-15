package by.epam.training.array2;

import java.util.Arrays;

/**
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в
 * каждом столбце число единиц равно номеру столбца.
 */
public class Task14 {
    public static void main(String[] args) {
        int m = 7;
        int n = 7;
        int[][] array = getRandomMatrix(m, n, 1);

        for (int j = 0; j < n; j++) {
            // Считаем количество единиц в столбце.
            int one = 0;
            for (int i = 0; i < m; i++) {
                if (array[i][j] == 1) {
                    one++;
                }
            }

            // Дописываем недостающие единицы или заменяем на ноль лишние.
            int diff = j + 1 - one;
            for (int i = 0; i < m && diff != 0; i++) {
                if (diff > 0 && array[i][j] == 0) {
                    array[i][j] = 1;
                    diff--;
                } else if (diff < 0 && array[i][j] == 1) {
                    array[i][j] = 0;
                    diff++;
                }
            }
        }

        // Результат.
        for (int i = 0; i < array.length; i++) {
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