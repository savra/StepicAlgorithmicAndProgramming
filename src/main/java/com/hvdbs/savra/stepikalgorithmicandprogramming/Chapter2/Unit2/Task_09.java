package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Разбитая пара
 * На вход подаётся одна строка, в которой через пробел записаны натуральные (целые положительные) числа.
 * У каждого числа есть пара. Все числа расположены в случайном порядке, но неизвестно сколько именно чисел.
 * Определено, что их количество меньше 1000. К сожалению, для одного из чисел парное (равное ему) утеряно.
 * Найдите это число.
 * <p>
 * На выход подайте утерянное число.
 * <p>
 * Желательно сделать решение:
 * - в функциональном стиле;
 * - за линейное время O(n).
 * <p>
 * <p>
 * Sample Input:
 * 2 3 9 3 2
 * Sample Output:
 * 9
 */
public class Task_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] source = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        int n = source.length;

        for (int i = 0, j = 1; j < n; i += 2, j += 2) {
            if (source[i] != source[j]) {
                System.out.println(source[i]);
                return;
            }
        }

        if (n % 2 != 0) {
            System.out.println(source[n - 1]);
        }
    }
}
