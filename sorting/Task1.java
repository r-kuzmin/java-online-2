package by.epam.training2.sorting;

import java.util.Arrays;

/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное
 * число k. Объединить их в один массив, включив второй массив между k-м и
 * (k+1)-м элементами первого, при этом не используя дополнительный массив.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int[] b = new int[] { 0, -1, -2 };
        int k = 3;

        int lenA = a.length;
        int lenB = b.length;
        int lenC = lenA + lenB;
        int[] c = new int[lenC];

        for (int i = 0; i < lenC; i++) {
            if (i <= k) {
                c[i] = a[i];
            } else if (i <= k + lenB) {
                c[i] = b[i - k - 1];
            } else {
                c[i] = a[i - lenB];
            }
        }

        System.out.println(Arrays.toString(c));
    }
}
