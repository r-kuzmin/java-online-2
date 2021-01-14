package by.epam.training2.sorting;

/**
 * Даны дроби P/Q (p, q - натуральные). Составить программу, которая приводит
 * эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */
public class Task8 {
    public static void main(String[] args) {
        int[] p = new int[] { 1, 8, 3, 4, 5 };
        int[] q = new int[] { 2, 16, 3, 5, 2 };

        System.out.print("Исходный ряд: ");
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + "/" + q[i] + "; ");
        }
        System.out.println("");

        // Упрощаем дроби для того, чтобы общий знаменатель был минимален.
        int gcd;
        for (int i = 0; i < p.length; i++) {
            gcd = greatestCommonDivisor(p[i], q[i]);
            p[i] /= gcd;
            q[i] /= gcd;
        }

        System.out.print("Упрощённый ряд: ");
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + "/" + q[i] + "; ");
        }
        System.out.println("");

        // Общий знаменатель = наименьшее общее кратное.
        int lcm = leastCommonMultiple(q);

        System.out.println("Общий знаменатель = " + lcm);

        // Приводим к общему знаменателю.
        int mult;
        for (int i = 0; i < p.length; i++) {
            mult = lcm / q[i];
            p[i] = p[i] * mult;
        }

        // Сортируем и выводим.
        insertionSort(p, 1);

        System.out.print("Отсортированный ряд: ");
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + "/" + lcm + "; ");
        }
        System.out.println("");
    }

    /**
     * Наименьшее общее кратное (НОК, least common multiple) для массива чисел.
     * 
     * @param array - исходный ряд чисел.
     * @return - натуральное число, которое делится без остатка на указанные числа.
     */
    private static int leastCommonMultiple(int[] array) {
        int result;

        if (array.length == 0) {
            return -1;
        }

        result = array[0];

        for (int i = 1; i < array.length; i++) {
            result = leastCommonMultiple(result, array[i]);
        }

        return result;
    }

    /**
     * Наименьшее общее кратное (НОК, least common multiple) для двух чисел.
     * 
     * @param array - исходный ряд чисел.
     * @return - натуральное число, которое делится без остатка на указанные числа.
     */
    private static int leastCommonMultiple(int a, int b) {
        int result;

        result = Math.abs(a * b) / greatestCommonDivisor(a, b);

        return result;
    }

    /**
     * Наибольший общий делитель (НОД, greatest common divisor) двух чисел.
     * Вычисляется по алгоритму Евклида.
     * https://ru.wikipedia.org/wiki/Алгоритм_Евклида
     * 
     * @return
     */
    private static int greatestCommonDivisor(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    /**
     * Сортировка элементов массива вставками с указанием шага между элементами. В
     * случае шага равного 1, вырождается в стандартный алгоритм сортировки
     * вставками. https://ru.wikipedia.org/wiki/Сортировка_вставками
     * 
     * @param array - исходный массив.
     * @param step  - расстояние для сравниваемых элементов.
     */
    private static void insertionSort(int[] array, int step) {
        int tmp;

        for (int i = step; i < array.length; i++) {
            for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                tmp = array[j];
                array[j] = array[j + step];
                array[j + step] = tmp;
            }
        }
    }
}
