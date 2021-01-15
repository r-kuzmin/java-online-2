package by.epam.training.array2;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Магическим квадратом порядка n называется квадратная матрица размера nxn,
 * составленная из чисел 1, 2, 3, ..., n так, что суммы по каждому столбцу,
 * каждой строке и каждой из двух больших диагоналей равны между собой.
 * Построить такой квадрат.
 */
public class Task16 {
    public static void main(String[] args) {
        int n;
        int[][] magic;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите порядок магического квадрата n: ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Введите порядок магического квадрата n: ");
        }
        n = sc.nextInt();

        if (n < 3) {
            System.out.println("n должно быть числом больше 2.");
            return;
        } else if (n % 2 == 0) {
            System.out.println("Для указанного порядка алгоритм построения не задан.");
            return;
        } else {
            magic = getSiameseMagicSquare(n);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(magic[i]));
        }

        checkMagicSquare(magic);
    }

    /**
     * Построение магического квадрата "Сиамским методом"
     * https://en.wikipedia.org/wiki/Siamese_method
     * 
     * @param n - порядок магического квадрата. Обязательно нечётный.
     */
    private static int[][] getSiameseMagicSquare(int n) {

        if (n % 2 == 0) {
            return null;
        }

        int[][] matrix = new int[n][n];

        int num = 1;
        int last = (int) Math.pow(n, 2);
        int i = 0;
        int j = n / 2;

        while (num <= last) {
            matrix[i][j] = num;

            // Сдвиг по диагонали вправо вверх.
            int newI = i - 1;
            int newJ = j + 1;

            if (newI < 0) {
                // Если добрались до верхней строки, опускаемся на нижнюю.
                newI = n - 1;
            }

            if (newJ == n) {
                // Если дошли до правой границы, возвращаемся к левой.
                newJ = 0;
            }

            if (matrix[newI][newJ] != 0) {
                // Если очередная ячейка занята, опуститься на строчку ниже.
                newI = i + 1;
                newJ = j;
            }

            i = newI;
            j = newJ;

            num++;
        }

        return matrix;
    }

    /**
     * Проверяет переданную матрицу, является ли она магическим квадратом.
     * 
     * @param array
     */
    private static boolean checkMagicSquare(int[][] array) {
        int n = array.length;

        // Главная диагональ.
        int summ = 0;
        for (int i = 0; i < n; i++) {
            summ += array[i][i];
        }

        // Побочная диагональ.
        int strSumm = 0;
        for (int i = 0; i < n; i++) {
            strSumm += array[i][n - i - 1];
        }
        if (strSumm != summ) {
            System.out.println("Сумма по главной диагонали = " + summ);
            System.out.println("Сумма побочной диагонали = " + strSumm);
            return false;
        }

        // Суммы по строкам.
        for (int i = 0; i < n; i++) {
            strSumm = 0;
            for (int j = 0; j < n; j++) {
                strSumm += array[i][j];
            }
            if (strSumm != summ) {
                System.out.println("Сумма по главной диагонали = " + summ);
                System.out.println("Сумма по строке (" + i + ") = " + strSumm);
                return false;
            }
        }

        // Суммы по столбцам.
        for (int j = 0; j < n; j++) {
            strSumm = 0;
            for (int i = 0; i < n; i++) {
                strSumm += array[i][j];
            }
            if (strSumm != summ) {
                System.out.println("Сумма по главной диагонали = " + summ);
                System.out.println("Сумма по столбцу (" + j + ") = " + strSumm);
                return false;
            }
        }

        return true;
    }
}
