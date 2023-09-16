package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit2;

import java.util.Scanner;

/**
 * Минимальное число
 * Напишите программу, которая в последовательности натуральных чисел определяет минимальное число, оканчивающееся на 3.
 * <p>
 * На вход программа получает:
 * - в первой строке одно целое число N - количество чисел в последовательности;
 * - в последующих N строках сами числа последовательности.
 * <p>
 * В последовательности всегда имеется хотя бы одно число, оканчивающееся на 3.
 * Количество чисел не превышает 1000. Введённые числа не превышают 30 000.
 * <p>
 * Программа должна вывести одно число – минимальное число, оканчивающееся на 3.
 * <p>
 * Для получения данных сначала считайте первую строку и извлеките число N, затем запустите цикл с N повторами и считайте N строк с данными для программы.
 * <p>
 * Sample Input 1:
 * 4
 * 63
 * 10
 * 531
 * 11
 * Sample Output 1:
 * 63
 * <p>
 * Sample Input 2:
 * 7
 * 1
 * 11
 * 10
 * 31
 * 33
 * 103
 * 993
 * Sample Output 2:
 * 33
 */
public class Task_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int min = Integer.MAX_VALUE;

        int i = 0;

        while (i < n) {
            int tmp = s.nextInt();

            if (tmp % 10 == 3 && tmp < min) {
                min = tmp;
            }

            i++;
        }

        System.out.println(min);
    }
}
