package by.epam.training.array2;

/**
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class Task10 {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;

        int[][] array = new int[m][n];
        array[0] = new int[] { 0, 1, 14, 3 };
        array[1] = new int[] { 4, -5, 6, 7 };
        array[2] = new int[] { 8, 9, 10, 11 };
        array[3] = new int[] { 12, 13, 2, -15 };

        for (int i = 0; i < m; i++) {
            if (array[i][i] > 0) {
                System.out.println("array (" + i + ") = " + array[i][i]);
            }
        }
    }
}
