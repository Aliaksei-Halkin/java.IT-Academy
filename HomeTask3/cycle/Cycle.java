package Cycle;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {

        //таблица умножения
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int k = i * j;
                System.out.println(i + " * " + j + " = " + k);
            }
            System.out.print("\n");
        }

        //2.1 факториал

        System.out.println("Введите число для вычисления факториала ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        System.out.println("Факториал = " + f);

        //2.2 факториал с хлжлм вычислений
        System.out.println("Введите число для вычисления факториала ");
        Scanner sc2 = new Scanner(System.in);
        int h = sc2.nextInt();
        int t = 1;
        for (int i = 1; i <= h; i++) {
            System.out.print("Вычисляем " + t + " * " + i);
            t = t * i;
            System.out.println(" = " + t);
        }
        System.out.println("Итого факториал = " + f);
/*Введите число для вычисления факториала
5
Вычисляем 1 * 1 = 1
Вычисляем 1 * 2 = 2
Вычисляем 2 * 3 = 6
Вычисляем 6 * 4 = 24
Вычисляем 24 * 5 = 120
Итого факториал = 120
*/
    }
}
