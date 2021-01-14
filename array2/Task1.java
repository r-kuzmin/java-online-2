package by.epam.training2.array2;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
 * больше последнего.
 */
public class Task1 {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;

        int[][] array = new int[m][n];
        array[0] = new int[] { 0, 1, 14, 3, 9 };
        array[1] = new int[] { 4, 5, 6, 7, 2 };
        array[2] = new int[] { 8, 9, 10, 11, 6 };
        array[3] = new int[] { 12, 13, 2, 15, -1 };

        // Номера столбцов, которые нужно вывести.
        boolean[] column = new boolean[n];
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0 && array[0][j] > array[m - 1][j]) {
                // Столбец нечетный = индекс четный, первый элемент > последнего.
                column[j] = true;
            }
        }

        // Вывод построчно.
        for (int i = 0; i < m; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                if (column[j]) {
                    System.out.print(array[i][j] + ", ");
                }
            }
            System.out.println("]");
        }
    }
}
