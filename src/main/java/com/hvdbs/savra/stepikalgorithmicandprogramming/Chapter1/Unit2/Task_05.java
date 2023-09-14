package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter1.Unit2;

import java.util.Scanner;

/**
 На вход подаётся одно целое положительное число в диапазоне от 0 до 100 включительно.

 На выход подайте одну строку True, если число чётное, False, если нечётное.

 Sample Input 1:
 8
 Sample Output 1:
 True

 Sample Input 2:
 13
 Sample Output 2:
 False
*/
public class Task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int source = scanner.nextInt();

        System.out.println(source % 2 == 0 ? "True" : "False");
    }
}
