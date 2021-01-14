package by.epam.training2.subroutine;

import java.util.Arrays;

/**
 * Дано натуральное число N. Написать метод (методы) для формирования массива,
 * элементами которого являются цифры числа N.
 */
public class Task10 {
    public static void main(String[] args) {
        int n = 123459876;

        int len = numberLength(n);
        int[] result = new int[len];

        fillNumberArray(result, n);

        System.out.println(Arrays.toString(result));
    }

    /**
     * Возвращает количество цифр в числе.
     */
    private static int numberLength(int n) {
        int len = 0;

        while (n > 0) {
            n /= 10;
            len++;
        }

        return len;
    }

    /**
     * Заполняет массив цифрами из переданного числа.
     * 
     * @param array
     * @param n
     */
    private static void fillNumberArray(int[] array, int n) {
        int i = 0;

        while (n > 0 && i < array.length) {
            array[i] = n % 10;
            n /= 10;
            i++;
        }
    }
}
