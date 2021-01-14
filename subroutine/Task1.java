package by.epam.training2.subroutine;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и
 * наименьшего общего кратного двух натуральных чисел.
 */
public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int gcd = greatestCommonDivisor(a, b);
        int lcm = leastCommonMultiple(a, b);

        System.out.println("Наибольший общий делитель: " + gcd);
        System.out.println("Наименьшее общее кратное: " + lcm);
    }

    /**
     * Наименьшее общее кратное (НОК, least common multiple) для двух чисел.
     * 
     * @param array - исходный ряд чисел.
     * @return - натуральное число, которое делится без остатка на указанные числа.
     */
    private static int leastCommonMultiple(int a, int b) {
        int result;

        if (a == 0 || b == 0) {
            return 0;
        }

        result = Math.abs(a * b) / greatestCommonDivisor(a, b);

        return result;
    }

    /**
     * Наибольший общий делитель (НОД, greatest common divisor) двух чисел.
     * Вычисляется по алгоритму Евклида.
     * https://ru.wikipedia.org/wiki/Алгоритм_Евклида
     * 
     * @return
     */
    private static int greatestCommonDivisor(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

}
