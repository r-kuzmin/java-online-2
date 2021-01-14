package by.epam.training2.subroutine;

/**
 * Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 14, 27 };

        // Числа взаимно просты, если у них НОД = 1.
        int gcd = greatestCommonDivisor(array);

        if (gcd == 1) {
            System.out.println("Числа взаимно простые.");
        } else {
            System.out.println("Числа не взаимно простые.");
        }
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
