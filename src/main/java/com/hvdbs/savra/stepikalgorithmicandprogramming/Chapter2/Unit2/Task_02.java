package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit2;

import java.util.Scanner;

/**
 * Любое чётное
 * На вход подаётся список из n [1, 1000] целых чисел из диапазона [0, 1000], записанных в одну строку через пробел.
 * <p>
 * На выход ваша программа должна вернуть любое чётное число из этого списка.
 * <p>
 * Гарантируется, что в списке будет не менее одного чётного числа.
 * <p>
 * Данные следует считывать из стандартного входного потока, например для Питона так:
 * # исходную строку разбиваем по пробелам на список подстрок
 * line = input()
 * list_substrings = line.split()
 * Ответ следует выводить в стандартный поток вывода, например для Питона так:
 * print(result)
 * <p>
 * Sample Input 1:
 * 1 5 8 6 3 2 8 9 0 4
 * Sample Output 1:
 * 8
 * <p>
 * Sample Input 2:
 * 6 1 1 7 9 0 6 3 7 4
 * Sample Output 2:
 * 6
 */
public class Task_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = s.nextLine().split(" ");

        for (String value : arr) {
            int tmp = Integer.parseInt(value);

            if (tmp % 2 == 0) {
                System.out.println(tmp);
                break;
            }
        }
    }
}
