package by.epam.training2.array2;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task2 {
    public static void main(String[] args) {
        int n = 4;

        int[][] array = new int[n][n];
        array[0] = new int[] { 0, 1, 14, 3 };
        array[1] = new int[] { 4, 5, 6, 7 };
        array[2] = new int[] { 8, 9, 10, 11 };
        array[3] = new int[] { 12, 13, 2, 15 };

        for (int i = 0; i < n; i++) {
            System.out.println(array[i][i]);
        }
    }
}
