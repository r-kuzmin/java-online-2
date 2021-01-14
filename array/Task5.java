package by.epam.training2.array;

/**
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
 * которых аi > i.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[] {-5, -2, 0, 1, 3, 7, 9, 12};

        for (int i = 1; i <= array.length; i++) {
            if (array[i-1] > i) {
                System.out.println("a[" + i + "] = " + array[i-1]);
            }
        }
    }
}
