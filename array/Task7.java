package by.epam.training.array;

/**
 * Даны действительные числа a1, a2, ... an. Найти max(a1 + a2n, a2 + a2n-1,
 * ..., an + an+1).
 */
public class Task7 {
	public static void main(String[] args) {
		double[] array = new double[] { -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8 };

		double max = Double.NEGATIVE_INFINITY; // Максимальный член ряда.
		int n = array.length / 2; // Длина исследуемого ряда.

		double temp;
		for (int i = 0; i < n; i++) {
			temp = array[i] + array[2 * n - i - 1];
			if (temp > max) {
				max = temp;
			}
		}

		System.out.println("Fmax = " + max);
	}
}
