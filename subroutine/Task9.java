package by.epam.training2.subroutine;

/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод
 * (методы) вычисления его площади, если угол между сторонами длиной X и Y —
 * прямой.
 */
public class Task9 {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = 5.5;
        double t = 2.1;

        // Площадь четырехугольника = сумма площадей двух треугольников,
        // образованных сторонами четырехугольника и диагональю.
        // !!! В условии не сказано, что четырехугольник выпуклый,
        // но предполагаем, что это так.
        double diag = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double area1 = areaTriangle(x, y, diag);
        double area2 = areaTriangle(z, t, diag);

        if (area1 < 0 || area2 < 0) {
            System.out.println("Ошибка при расчёте площади четырёхугольника.");
            return;
        }

        double sq = area1 + area2;
        System.out.println("Площадь четырехугольника = " + sq);
    }

    /**
     * Площадь треугольника по длине его сторон. Если стороны треугольника заданы
     * некорректно, возвращает -1.
     * 
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static double areaTriangle(double a, double b, double c) {
        double area = -1;

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Отрицательные стороны треугольника: " + a + ", " + b + ", " + c);
            return area;
        } else if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Не верно заданы стороны треугольника: " + a + ", " + b + ", " + c);
            return area;
        }

        double p = (a + b + c) / 2;

        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }
}
