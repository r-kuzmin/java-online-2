package by.epam.training2.array2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все
 * элементы одного столбца поставить на соответствующие им позиции другого, а
 * его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */
public class Task8 {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;

        int[][] array = new int[m][n];
        array[0] = new int[] { 0, 1, 14, 3, 9 };
        array[1] = new int[] { 4, 5, 6, 7, 2 };
        array[2] = new int[] { 8, 9, 10, 11, 6 };
        array[3] = new int[] { 12, 13, 2, 15, -1 };
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Индекс = Номер - 1
        int k;
        int l;

        System.out.print("Введите номер первого столбца: ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Введите номер первого столбца: ");
        }
        k = sc.nextInt() - 1;

        System.out.print("Введите номер второго столбца: ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Введите номер второго столбца: ");
        }
        l = sc.nextInt() - 1;

        int temp;
        for (int i = 0; i < m; i++) {
            temp = array[i][k];
            array[i][k] = array[i][l];
            array[i][l] = temp;

            System.out.println(Arrays.toString(array[i]));
        }
    }
}
