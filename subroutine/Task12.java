package by.epam.training.subroutine;

import java.util.Arrays;

/**
 * Даны натуральные числа К и N. Написать метод (методы) формирования массива А,
 * элементами которого являются числа, сумма цифр которых равна К и которые не
 * больше N.
 */
public class Task12 {
    public static void main(String[] args) {
        int k = 12;
        int n = 100;

        int[] result = new int[] {};

        for (int i = n; i > 0; i--) {
            if (sumOfDigits(i) == k) {
                result = addToArray(result, i);
            }
        }

        System.out.println(Arrays.toString(result));
    }

    /**
     * Возвращает сумму цифр переданного числа.
     * 
     * @param n
     */
    private static int sumOfDigits(int n) {
        int result = 0;

        while (n > 0) {
            result += n % 10;
            n /= 10;
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
