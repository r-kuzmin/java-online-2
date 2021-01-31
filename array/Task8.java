package by.epam.training.array;

import java.util.Arrays;

/**
 * Дана последовательность целых чисел (a1, a2, ..., an). Образовать новую
 * последовательность, выбросив из исходной те члены, которые равны min(a1, a2,
 * ..., an).
 */
public class Task8 {
	public static void main(String[] args) {
		int[] array = new int[] { -1, 5, 17, 0, -2, 56, -2, 9 };

		int min = array[0]; // Минимальный элемент исходного массива.
		int len = array.length; // Длина массива-результата.
		
		for (int i : array) {
			if (i < min) {
				min = i;
				len = array.length - 1;
			} else if (i == min) {
				len--;
			}
		}

		int[] result = new int[len];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (array[i] != min) {
				result[j] = array[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(result));
	}
}
