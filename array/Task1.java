package by.epam.training2.array;

/**
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
 * кратны данному К.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 3, 4, 15, 11, 7, 66, 34 };
        int k = 3;
        int summ = 0;

        for (int i : array) {
            if (i % k == 0) {
                summ += i;
            }
        }

        System.out.println("Summ = " + summ);
    }
}
