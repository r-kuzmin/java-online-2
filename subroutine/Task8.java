package by.epam.training.subroutine;

/**
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] +
 * D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод (методы) для вычисления
 * суммы трех последовательно расположенных элементов массива с номерами от k до
 * m.
 */
public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        System.out.println("D[l] + D[2] + D[3] = " + subSumm(array, 1, 3));
        System.out.println("D[3] + D[4] + D[5] = " + subSumm(array, 3, 5));
        System.out.println("D[4] + D[5] + D[6] = " + subSumm(array, 4, 6));
    }

    /**
     * Вычисляет сумму элементов массива в указанном диапазоне.
     * 
     * @param array - исходный массив.
     * @param k - индекс первого элемента диапазона.
     * @param m - индекс последнего элемента диапазона.
     * @return
     */
    private static int subSumm(int[] array, int k, int m) {
        int result = 0;

        if (array.length == 0) {
            return result;

        } else if (k > m || k < 0) {
            System.out.println("Необходимы положительные индексы, где k < m.");
            return result;

        } else if (k > array.length - 1 || m > array.length - 1) {
            System.out.println("Указанные индексы за границами массива.");
            return result;
        }

        for (int i = k; i <= m; i++) {
            result += array[i];
        }

        return result;
    }
}
