package by.epam.training2.sorting;

import java.util.Arrays;

/**
 * Даны две неубывающие последовательности. Образовать из них новую
 * последовательность чисел так, чтобы она тоже была неубывающей. Примечание.
 * Дополнительный массив не использовать.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 14, 14, 36, 47 };
        int[] b = new int[] { 0, 3, 10, 43 };

        int lenA = a.length;
        int lenB = b.length;
        int lenC = lenA + lenB;
        int[] c = new int[lenC];

        int idxA = 0;
        int idxB = 0;

        for (int i = 0; i < lenC; i++) {
            if (idxA < lenA && idxB < lenB) {
                if (a[idxA] <= b[idxB]) {
                    c[i] = a[idxA++];
                } else {
                    c[i] = b[idxB++];
                }
            } else if (idxA < lenA) {
                c[i] = a[idxA++];
            } else if (idxB < lenB) {
                c[i] = a[idxB++];
            }
        }

        System.out.println(Arrays.toString(c));
    }
}
