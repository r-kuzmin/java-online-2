package by.epam.training2.array2;

import java.util.Arrays;

/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class Task12 {
    public static void main(String[] args) {
        int[][] array = getRandomMatrix(10, 20, 100);

        System.out.println("Исходная матрица:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        sortMatrixString(array, false);

        System.out.println("Отсортированная матрица:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    /**
     * Cортировка строк матрицы по значению элементов.
     * 
     * @param array - исходная матрица.
     * @param trend - направление сортировки: true - по возрастанию, false - по
     *              убыванию.
     */
    private static void sortMatrixString(int[][] array, boolean trend) {
        boolean complited;

        do {
            // Цикл по строкам до тех пор, пока есть перестановки.
            complited = true;
            for (int i = 0; i < array.length - 1; i++) {
                int cmp = compareArrays(array[i], array[i + 1]);
                if ((trend && cmp == 1) || (!trend && cmp == -1)) {
                    changeMatrixString(array, i, i + 1);
                    complited = false;
                }
            }
        } while (!complited);
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

    /**
     * Сравнивает поэлементно 2 одномерных массива. Массивы должны быть одной
     * размерности.
     * 
     * @param a
     * @param b
     * @return (a > b) = 1; (a < b) = -1; (a = b) = 0.
     */
    private static int compareArrays(int[] a, int[] b) {
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                result = 1;
                break;
            } else if (a[i] < b[i]) {
                result = -1;
                break;
            }
        }

        return result;
    }

    /**
     * Меняет в матрице местами две строки.
     * 
     * @param array - исходная матрица.
     * @param k     - индекс первой строки.
     * @param l     - индекс второй строки.
     */
    private static void changeMatrixString(int[][] array, int k, int l) {
        int temp;

        for (int i = 0; i < array[0].length; i++) {
            temp = array[k][i];
            array[k][i] = array[l][i];
            array[l][i] = temp;
        }
    }
}
