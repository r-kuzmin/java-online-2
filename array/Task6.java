package by.epam.training.array;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 * порядковые номера которых являются простыми числами.
 */
public class Task6 {
	public static void main(String[] args) {
		double[] array = new double[] { -77.45, -100.1, -30.0, 0, 0, 0.001, 1, 2, 33.5 };
		double summ = 0;
		boolean prime;

		// Порядковые номера - не индексы массива, они начинаются с 1.
		// 1 - не является простым числом, поэтому начинаем с 2.
		for (int i = 2; i <= array.length; i++) {
			prime = true;

			// Проверяем делимость порядкового номера i на делители от 2 до (i/2 + 1).
			// Если есть хотя бы один делитель без остатка, значит i не простое.
			int limit = i / 2 + 1;
			for (int j = 2; j < limit; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}

			if (prime) {
				summ += array[i - 1];
			}
		}

		System.out.println("Summ = " + summ);
	}
}
