package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit2;

import java.util.Scanner;

/**
 * Потерянное число
 * На вход в одной строке подаются числа, записанные через пробел. Предполагалось, что в последовательности будут все числа от 1 до 100 включительно, но расположенные в случайном порядке. Однако, одно из чисел было утеряно. Найдите это число.
 * <p>
 * На выход подайте утерянное число.
 * <p>
 * Желательно сделать решение:
 * - в функциональном стиле;
 * - за линейное время O(n).
 * <p>
 * <p>
 * Sample Input:
 * 76 23 80 87 8 82 11 78 28 92 30 66 42 26 64 84 75 27 51 10 38 39 62 74 57 13 20 71 22 33 17 48 50 61 16 29 83 44 35 15 41 63 69 34 40 49 95 4 14 1 97 60 86 85 6 77 55 2 31 46 59 3 19 65 90 91 88 37 93 25 43 53 70 94 81 54 89 52 12 21 24 18 7 56 100 73 9 68 96 72 32 36 79 67 47 45 99 58 98
 * Sample Output:
 * 5
 */
public class Task_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] source = java.util.Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        long[] result = new long[2];

        for (int j : source) {
            result[(j - 1) / 64] |= 1L << (j % 64 - 1);
        }

        for (int i = 1; i <= source.length; i++) {
            if (((result[(i - 1) / 64]) & (1L << ((i - 1) % 64))) == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
