package by.epam.training.array2;

import java.util.Arrays;

/**
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму
 * матрицу и номера строк, в которых число 5 встречается три и более раз.
 */
public class Task11 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        int[][] array = new int[m][n];
        boolean[] str = new boolean[m];

        for (int i = 0; i < m; i++) {
            // Заполняем строку. Считаем количество элементов, равных 5.
            int k = 0;

            for (int j = 0; j < n; j++) {
                int a = (int) (Math.random() * 16);
                array[i][j] = a;
                if (a == 5) {
                    k++;
                }
            }

            str[i] = (k >= 3);

            // Выводим очередную строку матрицы.
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.print("Строки: ");
        for (int i = 0; i < m; i++) {
            if (str[i]) {
                System.out.print(i + ", ");
            }
        }
    }
}
