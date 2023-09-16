package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit2;

import java.util.Scanner;

/**
 * Нечётные числа
 * На вход подаётся одна строка, в которой через пробел записаны целые числа в диапазоне [1; 1000]. Количество чисел в строке [10; 100].
 * На выход подайте строку, в которой через пробел записаны только нечётные числа из исходной строки, не нарушая последовательности чисел.
 * <p>
 * Пример входной строки:
 * 1 2 3
 * <p>
 * Пример выходной строки:
 * 1 3
 * <p>
 * Sample Input 1:
 * 1 2 3 4
 * Sample Output 1:
 * 1 3
 * <p>
 * <p>
 * Sample Input 2:
 * 100 99 50 51 52 2 1
 * Sample Output 2:
 * 99 51 1
 */
public class Task_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = s.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            int tmp = Integer.parseInt(arr[i]);
            if (tmp % 2 != 0) {
                sb.append(tmp);

                if (i != arr.length - 1) {
                    sb.append(" ");
                }
            }
        }

        System.out.println(sb);
    }
}
