package by.epam.training2.sorting;

/**
 * Пусть даны две неубывающие последовательности действительных чисел. Требуется
 * указать те места, на которые нужно вставлять элементы второй
 * последовательности в первую последовательность так, чтобы новая
 * последовательность оставалась возрастающей.
 */
public class Task7 {
    public static void main(String[] args) {
        double[] arrayA = new double[] { -1.0, 2.0, 5.5, 7.1, 9.06, 15.7, 32 };
        double[] arrayB = new double[] { 0, 8.0, 17.5 };

        // На больших последовательностях целесообразно применять двоичный поиск той
        // области, где находятся нужные позиции. Но понадобятся спец. исследования
        // границ областей, чтобы не потерять возможно значимые позиции.
        for (double d : arrayB) {
            System.out.print("Допустимые позиции для значения " + d + ": ");
            for (int i = 0; i < arrayA.length; i++) {

                if (i == 0) {
                    // Левая граница.
                    if (d <= arrayA[i + 1]) {
                        System.out.print(i + "; ");
                    }

                } else if (i == arrayA.length - 1) {
                    // Правая граница.
                    if (d >= arrayA[arrayA.length - 2]) {
                        System.out.print(i + "; ");
                    }

                } else if (d >= arrayA[i - 1] && d <= arrayA[i + 1]) {
                    // Допустимые позиции замены.
                    System.out.print(i + "; ");

                } else if (d < arrayA[i]) {
                    // Перебирать элементы заведомо большие нет смысла.
                    break;
                }
            }
            System.out.println("");
        }
    }
}
