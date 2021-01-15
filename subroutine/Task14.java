package by.epam.training.subroutine;

import java.util.Arrays;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга,
 * если сумма его цифр, возведенная в степень n, равна самому числу. Найти все
 * числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 * 
 * !!! В условии ошибка (опечатка): возводить в степень следует не сумму цифр, а
 * каждую цифру, а потом суммировать. Т. е. следует читать "... сумма его цифр,
 * возведённЫХ в степень..." https://ru.wikipedia.org/wiki/Число_Армстронга.
 */
public class Task14 {
    public static void main(String[] args) {
        int k = 100000;

        int[] armstrong = armstrongNumbers(1, k);

        System.out.println(Arrays.toString(armstrong));
    }

    /**
     * Возвращает массив чисел Армстронга на заданном интервале.
     */
    private static int[] armstrongNumbers(int a, int b) {
        int[] result = new int[0];

        for (int i = a; i <= b; i++) {
            int num = numberLength(i);
            int sum = sumOfDigits(i, num);

            if (sum == i) {
                result = addToArray(result, i);
            }
        }

        return result;
    }

    /**
     * Возвращает сумму цифр переданного числа, возведённых в указанную степень.
     * 
     * @param n - исходное число.
     * @param x - степень.
     */
    private static int sumOfDigits(int n, int x) {
        int result = 0;

        while (n > 0) {
            result += Math.pow(n % 10, x);
            n /= 10;
        }

        return result;
    }

    /**
     * Возвращает количество цифр в числе.
     */
    private static int numberLength(int n) {
        int len = 0;

        n = Math.abs(n);

        while (n > 0) {
            n /= 10;
            len++;
        }

        return len;
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
