package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Лишнее число
 * На вход в одной строке подаются числа, записанные через пробел. Предполагалось, что в последовательности будут все числа от 1 до 100 включительно, но расположенные в случайном порядке. Однако, одно из чисел было записано дважды (то есть в последовательности оказалось 101 число). Найдите число, записанное дважды.
 * <p>
 * На выход подайте повторяющееся число.
 * <p>
 * Желательно сделать решение:
 * - в функциональном стиле;
 * - за линейное время O(n).
 * <p>
 * Sample Input:
 * 75 9 23 61 66 35 88 80 48 58 31 13 34 55 42 14 72 38 63 5 93 32 17 12 26 98 45 6 60 25 67 59 7 69 36 100 46 40 37 87 8 84 97 16 76 43 62 50 11 49 78 99 33 10 52 94 41 85 3 92 89 51 4 18 28 2 82 71 24 39 81 19 14 54 65 79 30 21 77 57 53 68 90 29 70 73 74 64 83 27 95 86 91 44 96 22 56 20 15 1 47
 * Sample Output:
 * 14
 */
public class Task_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] source = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long[] res = new long[2];

        for(int i : source) {
            if ((res[(i - 1) / 64] & (1L << (i - 1) % 64)) != 0) {
                System.out.println(i);
                break;
            }

            res[(i - 1) / 64] = res[(i - 1) / 64] | 1L << (i - 1) % 64;
        }
    }
}
