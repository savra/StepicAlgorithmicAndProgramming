package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit2;

import java.util.Scanner;

/**
 Тройка чисел
 На вход подаётся одна строка, в которой через пробел записаны натуральные числа из диапазона [0; 100].
 Количество чисел может быть от 10 до 100 включительно.

 На выход подайте:
 - сумму трёх самых маленьких значений из списка чисел.

 Sample Input 1:
 1 2 3 4 5 6 7 8 9 10
 Sample Output 1:
 6


 Sample Input 2:
 1 2 3 44 55 66 77 88 99 0
 Sample Output 2:
 3
 */
public class Task_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = s.nextLine().split(" ");

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        for (String value : arr) {
            int cur = Integer.parseInt(value);

            if (cur < min1) {
                min3 = min2;
                min2 = min1;
                min1 = cur;

                continue;
            }

            if (cur < min2) {
                min3 = min2;
                min2 = cur;

                continue;
            }

            if (cur < min3) {
                min3 = cur;
            }
        }

        System.out.println(min3 + min2 + min1);
    }
}
