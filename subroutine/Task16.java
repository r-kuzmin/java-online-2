package by.epam.training.subroutine;

import java.util.Arrays;

/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только
 * нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
 * решения задачи использовать декомпозицию.
 */
public class Task16 {
    public static void main(String[] args) {
        int n = 4;

        int[] array = notEvenNumbers(n);

        System.out.println("Исходный ряд:");
        System.out.println(Arrays.toString(array));

        int summ = 0;
        for (int i : array) {
            summ += i;
        }

        System.out.println("Сумма ряда = " + summ);

        int cnt = evenNumbersCount(summ);

        System.out.println("Чётных цифр в сумме = " + cnt);
    }

    /**
     * Подсчитывает количество чётных цифр в числе.
     * 
     * @return
     */
    private static int evenNumbersCount(int n) {
        int cnt = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                cnt++;
            }
            n /= 10;
        }

        return cnt;
    }

    /**
     * Возвращает массив n-значных чисел, содержащих только нечётные цифры.
     * 
     * @param n - количество разрядов в числах.
     * @return
     */
    private static int[] notEvenNumbers(int n) {
        int[] array = new int[0];

        if (n < 1) {
            System.out.println("Не верно задано количество разрядов.");
            return array;
        }

        // Верхний предел. Например, для 3, k = 1000.
        int k = (int) Math.pow(10, n);

        for (int i = k / 10; i < k; i++) {
            boolean notEven = true;

            // Цикл по разрядам справа налево.
            int x = i;
            while (x > 0) {
                if (x % 2 == 0) {
                    notEven = false;
                    break;
                }
                x /= 10;
            }

            if (notEven) {
                array = addToArray(array, i);
            }
        }

        return array;
    }

    /**
     * Добавляет в массив новый элемент.
     * 
     * @param array - исходный массив.
     * @param n     - новый элемент.
     * @return - новый массив, дополненный элементом.
     */
    private static int[] addToArray(int[] array, int n) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = n;

        return newArray;
    }
}
