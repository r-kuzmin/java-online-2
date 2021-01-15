package by.epam.training.subroutine;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод
 * вычисления площади треугольника.
 */
public class Task3 {
    public static void main(String[] args) {
        double a = 5.96;

        double b = triangleSq(a) * 6;

        System.out.println("Площадь шестиугольника = " + b);
    }

    /**
     * Вычисляет площадь равностороннего треугольника.
     * 
     * @param a - длина стороны.
     * @return
     */
    private static double triangleSq(double a) {
        double result = 0;

        if (a <= 0) {
            return result;
        };

        result = Math.pow(a, 2) * Math.sqrt(3) / 4;

        return result;
    }
}
