package by.epam.training2.array;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 * порядковые номера которых являются простыми числами.
 */
public class Task6 {
    public static void main(String[] args) {
        double[] array = new double[] { -77.45, -100.1, -30.0, 0, 0, 0.001, 1, 2, 33.5 };
        double summ = 0;
        boolean prime;

        for (int i = 0; i < array.length; i++) {
            prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (i > 1 && prime) {
                summ += array[i];
            }
        }

        System.out.println("Summ = " + summ);
    }
}
