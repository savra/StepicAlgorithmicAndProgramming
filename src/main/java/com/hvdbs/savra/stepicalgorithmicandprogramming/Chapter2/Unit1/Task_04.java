package com.hvdbs.savra.stepicalgorithmicandprogramming.Chapter2.Unit1;

import java.util.Scanner;

/**
 * Любое чётное
 * На вход подаётся список из n [1, 1000] целых чисел из диапазона [0, 1000], записанных в одну строку через пробел.
 * <p>
 * На выход ваша программа должна вернуть любое чётное число из этого списка.
 * <p>
 * Гарантируется, что в списке будет не менее одного чётного числа.
 * <p>
 * Sample Input 1:
 * 6 2 9 7 7 0 0 7 0 8
 * Sample Output 1:
 * 6
 * <p>
 * <p>
 * Sample Input 2:
 * 7 7 6 0 1 3 0 1 8 4
 * Sample Output 2:
 * 6
 */
public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");

        for (String value : s) {
            int tmp = Integer.parseInt(value);

            if (tmp % 2 == 0) {
                System.out.println(tmp);
                return;
            }
        }
    }
}
