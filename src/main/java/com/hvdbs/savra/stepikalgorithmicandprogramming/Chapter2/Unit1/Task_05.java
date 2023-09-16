package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit1;

import java.util.Scanner;

/**
 * Чётные против нечётных
 * Напишите программу, которая в последовательности натуральных чисел определяет количество чётных и нечётных чисел. Ответ выводится в виде одного слова:
 * - equal - если чисел одинаковое количество,
 * - odd - если нечётных больше,
 * - even - если чётных больше.
 * <p>
 * На вход:
 * программа получает одну строку с некоторым количеством (от 1 до 1000 включительно) целых положительных чисел (значения чисел от 1 до 30000 включительно), записанных через пробел.
 * На выход:
 * программа должна вывести одну строку с ответом - в зависимости от сравнения количества чётных и нечётных.
 * <p>
 * Sample Input 1:
 * 1 2 3 4
 * Sample Output 1:
 * equal
 * <p>
 * <p>
 * Sample Input 2:
 * 1 3 5 2
 * Sample Output 2:
 * odd
 * <p>
 * <p>
 * Sample Input 3:
 * 1 2 4 2
 * Sample Output 3:
 * even
 */
public class Task_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] source = s.nextLine().split(" ");
        int odd = 0;
        int even = 0;

        for (String value : source) {
            int c = Integer.parseInt(value);

            if (c % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if (odd == even) {
            System.out.println("equal");
        } else if (odd > even) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}
