package by.epam.training2.array;

/**
 * Даны действительные числа a1, a2, ... an. Найти max(a1 + a2n, a2 + a2n-1,
 * ..., an + an+1).
 */
public class Task7 {
    public static void main(String[] args) {
        double[] array = new double[] { -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = 9;
        double max = Double.NEGATIVE_INFINITY;
        double temp;

        if (n < 1 || n > array.length / 2) {
            System.out.println("Допустимое n: 0 < n <= " + array.length / 2 + ".");
            return;
        }

        for (int i = 0; i < n; i++) {
            temp = array[i] + array[2 * n - i - 1];
            if (temp > max) {
                max = temp;
            }
        }

        System.out.println("Fmax = " + max);
    }
}
