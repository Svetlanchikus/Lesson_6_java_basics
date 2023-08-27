package src;

public class Lessen6 {
    public static void main(String[] args) {


        int a = 3758;
        int b = 454;

        //1. Арифметические операторы
        System.out.println("a + b : " + (a + b));
        System.out.println("a - b : " + (a - b));
        System.out.println("a * b : " + (a * b));
        System.out.println("a / b : " + (a / b));
        System.out.println("a % b : " + (a % b));
        System.out.println("a + b - a / b * a + b :" + (a + b - a / b * a + b));

        // Логические операторы

        if (a > b) {
            System.out.println("a + b = " + (a + b));
        } else {
            System.out.println("a - b = " + (a - b));
        }

        if (a > 0 && b < 100) {
            System.out.println("a * b = " + (a * b));
        }

        a = -6523;
        if (a > 0 || b < 100) {
            System.out.println("a / b = " + (a / b));
        }

        // Вычисление с комбинаций типов данных (int и double)

        int c = 454;
        double d = 32.4;
        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c * d = " + (c* d));
        System.out.println("c / d = " + (c / d));
    }
}
