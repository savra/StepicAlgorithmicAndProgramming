package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;

/**
 * Сортировка вниз
 * На вход подаётся одна строка, в которой через пробел записаны натуральные числа из диапазона [0; 100].
 * Количество чисел может быть от 10 до 100 включительно.
 * <p>
 * На выход подайте:
 * - в одну строку через пробел отсортированный по убыванию (не возрастанию) список чисел.
 * <p>
 * Sample Input:
 * 1 2 3 4 5 6 7 8 9 10
 * <p>
 * Sample Output:
 * 10 9 8 7 6 5 4 3 2 1
 */
public class Task_04 {
    public static void main(String[] args) {
        System.out.println(
                Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                        .map(Integer::valueOf)
                        .sorted(Comparator.reverseOrder())
                        .map(String::valueOf)
                        .collect(joining(" ")));
    }
}
