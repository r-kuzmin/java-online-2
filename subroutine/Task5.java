package by.epam.training2.subroutine;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, но
 * больше всех других элементов).
 */
public class Task5 {
    public static void main(String[] args) {
        double[] array = new double[] { 7.0, 48.0, 36.5, -14.1, 14.06, 3.7, 60, 2, -1 };

        shellSort(array);

        System.out.println("Второе по величине число = " + array[1]);
    }

    /**
     * Сортировка массива по убыванию вставками.
     * 
     * @param array - исходный массив.
     */
    private static void shellSort(double[] array) {
        double tmp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i - 1; j >= 0 && array[j] < array[j + 1]; j--) {
                tmp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = tmp;
            }
        }
    }
}
