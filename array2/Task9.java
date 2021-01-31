package by.epam.training.array2;

/**
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
 * столбце. Определить, какой столбец содержит максимальную сумму.
 */
public class Task9 {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;

        int[][] array = new int[m][n];
        array[0] = new int[] { 0, 1, 14, 3, 9 };
        array[1] = new int[] { 4, 5, 6, 7, 2 };
        array[2] = new int[] { 8, 9, 10, 11, 6 };
        array[3] = new int[] { 12, 13, 2, 15, 7 };

        // Массив для хранения сумм по столбцам.
        int summ[] = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                summ[j] += array[i][j];
            }
        }

        // Максимальная сумма и номер столбца.
        int maxSumm = 0;
        int column = 0;

        for (int i = 0; i < m; i++) {
            if (maxSumm < summ[i]) {
                maxSumm = summ[i];
                column = i;
            }
        }

        System.out.println("Максимальная сумма в колонке [" + column + "] = " + maxSumm);
    }
}
