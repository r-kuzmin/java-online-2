package by.epam.training.subroutine;

import java.util.Arrays;

/**
 * На плоскости заданы своими координатами n точек. Написать метод (методы),
 * определяющие, между какими из пар точек самое большое расстояние. Указание:
 * координаты точек занести в массив.
 */
public class Task4 {
    public static void main(String[] args) {
        double[][] array = new double[][] { { 5, 3 }, { 0, 1 }, { -7, -7 }, { 2, -2 }, { -6, 15 } };

        // Для каждой точки исходного массива находим самую далёкую
        // и записываем в массив result пару { индекс, расстояние }.
        double[][] result = new double[array.length][2];

        double currDist;
        double maxDist;
        int point;

        for (int i = 0; i < array.length - 1; i++) {
            point = i;
            maxDist = 0;

            for (int j = i + 1; j < array.length; j++) {
                currDist = distance(array[i], array[j]);
                if (currDist > maxDist) {
                    point = j;
                    maxDist = currDist;
                }
            }

            result[i] = new double[] { point, maxDist };
        }

        // Находим максимальное расстояние и выводим результат.
        int pointA = 0;
        int pointB = 0;
        double distance = 0;

        for (int i = 0; i < result.length; i++) {
            if (result[i][1] > distance) {
                pointA = i;
                pointB = (int) result[i][0];
                distance = result[i][1];
            }
        }

        System.out.print("Максимальное расстояние между точками ");
        System.out.print(pointA + Arrays.toString(array[pointA]) + " и ");
        System.out.print(pointB + Arrays.toString(array[pointB]) + " = ");
        System.out.println(distance);
    }

    /**
     * Вычисляет расстояние между двумя точками. Работает для любой размерности
     * пространства. В случае ошибки возвращает -1.
     * 
     * @param a - массив координат первой точки.
     * @param b - массив координат второй точки.
     * @return
     */
    private static double distance(double[] a, double[] b) {
        double result = -1;

        if (a.length == 0 || b.length == 0) {
            System.out.println("Не заданы координанты точки.");
            return result;
        }

        if (a.length != b.length) {
            System.out.println("У точек должно быть равное количество координат.");
            return result;
        }

        double summ = 0;

        for (int i = 0; i < a.length; i++) {
            summ += Math.pow(b[i] - a[i], 2);
        }

        result = Math.sqrt(summ);

        return result;
    }
}
