package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit3;

import java.util.Scanner;

/**
 * Горизонтальная линия
 * На вход подаётся целое число N в диапазоне от 1 до 100.
 * <p>
 * На выход подайте одну строку - имитацию горизонтальной линии, содержащую N символов 'X' (английская заглавная X).
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
 * XXX
 */
public class Task_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (n > 0) {
            System.out.print("X");
            n--;
        }
    }
}
