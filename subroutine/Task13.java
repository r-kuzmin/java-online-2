package by.epam.training.subroutine;

import java.util.Arrays;

/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга
 * на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
 * [n, 2n], где n - заданное натуральное число больше 2. Для решения задачи
 * использовать декомпозицию.
 */
public class Task13 {
    public static void main(String[] args) {
        int n = 300;

        int[][] result = twinPrimes(n, n * 2);

        for (int[] is : result) {
            System.out.println(Arrays.toString(is));
        }
    }

    /**
     * Функция возвращает массив пар простых чисел "близнецов" для заданного
     * отрезка. https://ru.wikipedia.org/wiki/Числа-близнецы.
     * 
     * @param a - начало отрезка.
     * @param b - конец отрезка.
     * @return
     */
    private static int[][] twinPrimes(int a, int b) {
        int[][] result = new int[0][];

        if (a >= b) {
            System.out.println("Неверно задан диапазон поиска пар простых чисел.");
            return result;
        }

        if (a <= 3 && b >= 5) {
            // Тривиальный случай.
            int[] x = new int[] { 3, 5 };
            result = addToArray(result, x);
        }

        // Для того, чтобы не перебирать все простые числа подряд,
        // нужно определить границы для функции twinPrime.
        int min = (a - 1) / 6;
        int max = (b + 1) / 6;

        for (int i = min; i <= max; i++) {
            int[] couple = twinPrime(i);
            if (couple != null && couple[0] >= a && couple[1] <= b) {
                result = addToArray(result, couple);
            }
        }

        return result;
    }

    /**
     * Возвращает пару простых чисел "близнецов" по формуле 6n ± 1. Если для
     * указанного n хотя бы одно из чисел не является простым, функция возвращает
     * null.
     * 
     * @param n - натуральное число.
     * @return
     */
    private static int[] twinPrime(int n) {
        int[] result = null;

        if (n <= 0) {
            return result;
        }

        int x = n * 6 - 1;

        if (isSimple(x) && isSimple(x + 2)) {
            result = new int[2];
            result[0] = x;
            result[1] = x + 2;
        }

        return result;
    }

    /**
     * Проверяет факт, что модуль переданного числа является простым.
     * 
     * @param n - исходное число.
     * @return
     */
    private static boolean isSimple(int n) {
        n = Math.abs(n);

        // Проверка для всех чётных делителей.
        if (n % 2 == 0) {
            return false;
        }

        // Проверяем делимость на нечетные числа.
        int max = (int) Math.sqrt(n);
        for (int i = 3; i <= max; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Добавляет в массив новый элемент.
     * 
     * @param array - исходный массив.
     * @param n     - новый элемент.
     * @return - новый массив, дополненный элементом.
     */
    private static int[][] addToArray(int[][] array, int[] n) {
        int[][] newArray = new int[array.length + 1][];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = n;

        return newArray;
    }
}
