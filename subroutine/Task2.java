package by.epam.training.subroutine;

/**
 * Написать метод (методы) для нахождения наибольшего общего делителя четырех
 * натуральных чисел.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[] { 99, 18, 36, 90 };

        int gcd = greatestCommonDivisor(array);

        System.out.println("Наибольший общий делитель = " + gcd);
    }

    /**
     * Наибольший общий делитель (НОД, greatest common divisor) массива чисел.
     * Вычисляется по алгоритму Евклида.
     * https://ru.wikipedia.org/wiki/Алгоритм_Евклида
     * 
     * @param array - исходный набор чисел.
     * @return
     */
    private static int greatestCommonDivisor(int[] array) {

        int length = array.length;

        if (length == 0) {
            return 0;
        } else if (length == 1) {
            return array[0];
        }

        boolean finish;

        do {
            finish = true;

            // Находим минимальное значение.
            int min = Integer.MAX_VALUE;
            for (int i : array) {
                if (i < min) {
                    min = i;
                }
            }

            for (int i = 0; i < length; i++) {
                // Вычитаем из больших значений минимальное.
                if (array[i] > min) {
                    array[i] -= min;
                }

                // Если в массиве есть различные значения, продолжаем цикл.
                if (array[i] != array[0]) {
                    finish = false;
                }
            }

        } while (!finish);

        return array[0];
    }
}
