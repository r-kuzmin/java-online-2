package by.epam.training.array;

/**
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
 * в нем отрицательных, положительных и нулевых элементов.
 */
public class Task3 {
    public static void main(String[] args) {
        double[] array = new double[] { -100.1, -77.45, -30.0, 0, 0, 0.001, 1, 2, 33.5 };

        int neg = 0;
        int zero = 0;
        int pos = 0;

        for (double d : array) {
            if (d < 0) {
                neg++;
            } else if (d == 0) {
                zero++;
            } else {
                pos++;
            }
        }

        System.out.println("Negativ = " + neg);
        System.out.println("Zero = " + zero);
        System.out.println("Positiv = " + pos);
    }
}
