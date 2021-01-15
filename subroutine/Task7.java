package by.epam.training.subroutine;

/**
 * Написать метод (методы) для вычисления суммы факториалов всех нечетных чисел
 * от 1 до 9.
 */
public class Task7 {
    public static void main(String[] args) {
        int x = 9;
        int summ = 0;

        for (int i = 1; i <= x; i += 2) {
            summ += factorial(i);
        }

        System.out.println("Сумма факториалов = " + summ);
    }

    /**
     * Вычисляет факториал числа.
     * 
     * @param x
     * @return
     */
    private static int factorial(int x) {
        int result = 1;

        if (x < 0) {
            System.out.println("Для отрицательных чисел факториал не определён.");
            return 0;

        } else if (x > 31) {
            System.out.println("Слишком большой x.");
            return 0;

        } else if (x == 0) {
            return 1;
        }

        for (int i = 1; i <= x; i++) {
            result *= i;
        }

        return result;
    }
}
