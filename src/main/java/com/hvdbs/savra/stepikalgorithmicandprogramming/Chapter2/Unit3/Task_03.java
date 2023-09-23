package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit3;

import java.util.Scanner;

/**
 * Вертикальная линия
 * На вход подаётся целое число N в диапазоне от 1 до 100.
 * <p>
 * На выход подайте имитацию вертикальной линии в виде N строк, каждая из которых содержит только один символ - 'X'.
 * <p>
 * Sample Input 1:
 * 1
 * Sample Output 1:
 * X
 * <p>
 * <p>
 * Sample Input 2:
 * 3
 * Sample Output 2:
 * X
 * X
 * X
 */
public class Task_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (n > 0) {
            System.out.println("X");
            n--;
        }
    }
}
