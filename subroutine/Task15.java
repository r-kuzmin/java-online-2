package by.epam.training.subroutine;

import java.util.Arrays;

/**
 * Найти все натуральные n-значные числа, цифры в которых образуют строго
 * возрастающую последовательность (например, 1234, 5789). Для решения задачи
 * использовать декомпозицию.
 */
public class Task15 {
    public static void main(String[] args) {
        int n = 3;

        int[] array = numbers(n, 1);

        System.out.println(Arrays.toString(array));
    }

    /**
     * Возвращает массив натуральных чисел. В каждом числе цифры образуют строго
     * возрастающую последовательность.
     * 
     * @param n - длина чисел в массиве.
     * @param a - минимальная цифра, с которой могут начинаться числа.
     */
    private static int[] numbers(int n, int a) {
        int[] result = new int[0];

        // В десятичной системе первая цифра последнего числа ряда всегда известна.
        // Например, для n = 4 это будет 6, потому что последнее число не будет больше,
        // чем 6789. Отсюда max(i) = 10 - n. Перебираем в цикле цифры, которые будут на
        // первом месте в формируемых числах.
        int maxI = 10 - n;

        for (int i = a; i <= maxI; i++) {
            if (n > 1) {
                // Получаем массив чисел, которые на 1 знак короче и начинаются на цифру,
                // которая строго больше текущей.
                int[] array = numbers(n - 1, i + 1);

                for (int j = 0; j < array.length; j++) {
                    // Текущая цифра в нужном разряде + различные комбинации дальше.
                    int next = (int) Math.pow(10, n - 1) * i + array[j];
                    result = addToArray(result, next);
                }
            } else {
                // Массив чисел от a до 9.
                result = new int[10 - a];
                for (int j = a; j <= 9; j++) {
                    result[j - a] = j;
                }
            }
        }

        return result;
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
