package by.epam.training2.subroutine;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его
 * цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для
 * решения задачи использовать декомпозицию.
 */
public class Task17 {
    public static void main(String[] args) {
        int n = 555;
        int c = 0;

        while (n > 0) {
            c++;
            int s = summNumbers(n);
            int t = n - s;
            System.out.println(c + ": " + n + " - " + s + " = " + t);
            n -= s;
        }

        System.out.print("Всего итераций: " + c);
    }

    /**
     * Возвращает сумму цифр заданного числа.
     * 
     * @param n
     */
    private static int summNumbers(int n) {
        int res = 0;

        n = Math.abs(n);

        while (n > 0) {
            res += n % 10;
            n /= 10;
        }

        return res;
    }
}
