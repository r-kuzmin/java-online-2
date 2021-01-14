package by.epam.training2.array;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто
 * встречающееся число. Если таких чисел несколько, то определить наименьшее из
 * них.
 */
public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[] { -1, 5, 17, 0, -2, 17, -2, 9 };
        int result;
        
        if (array.length == 0) {
            System.out.println("Длина исходного массива равна нулю.");
            return;
        } else {
            result = Integer.MAX_VALUE;
        }

        // Количество различных значений в исходном массиве.
        int[] counters = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            counters[i] = counter;
        }

        // Наиболее часто встречающееся значение.
        int maxCounter = 0;
        for (int i : counters) {
            if (i > maxCounter) {
                maxCounter = i;
            }
        }

        // Результат.
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] == maxCounter) {
                if (array[i] < result) {
                    result = array[i];
                }
            }
        }

        System.out.println(result);
    }
}
