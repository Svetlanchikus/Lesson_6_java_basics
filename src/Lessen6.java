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

        // Проверка перегрузки
        byte e = -128;
        e -= 2;
        System.out.println("Перегрузка byte: " + e);
        short f = -32768;
        f += 5;
        System.out.println("Перегрузка short: " + f);
        int g = 123456;
        g -= 10;
        System.out.println("Перегрузка int: " + g);
        long h = 1234455768;
        h -= 15;
        System.out.println("Перегрузка long: " + h);
        char i = 'a';
        i +=1244;
        System.out.println("Перегрузка char: " + i);
    }
}
