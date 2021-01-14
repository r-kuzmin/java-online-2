package by.epam.training2.subroutine;

/**
 * Написать метод (методы), определяющий, в каком из данных двух чисел больше
 * цифр.
 */
public class Task11 {
    public static void main(String[] args) {
        int a = 123459876;
        int b = -123459611;

        switch (compareNumbersLength(a, b)) {
            case 1:
                System.out.println("В первом числе больше цифр.");
                break;
            case 0:
                System.out.println("Числа одной длины.");
                break;
            case -1:
                System.out.println("В первом числе меньше цифр.");
                break;
        }
    }

    /**
     * Сравнивает два числа по количеству цифр.
     * 
     * @return 1, если первое число длинее второго; 0, если числа равны; -1, если
     *         первое число короче второго.
     */
    private static int compareNumbersLength(int a, int b) {
        int x = numberLength(a);
        int y = numberLength(b);

        if (x > y) {
            return 1;
        } else if (x < y) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * Возвращает количество цифр в числе.
     */
    private static int numberLength(int n) {
        int len = 0;

        n = Math.abs(n);

        while (n > 0) {
            n /= 10;
            len++;
        }

        return len;
    }
}
