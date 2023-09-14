package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter1.Unit2;

import java.util.Scanner;

/**
 На вход подаётся одна строка длиною не более 100 символов.
 На выход подайте перевёрнутую строку.

 Например.
 Вход:
 Строка
 Выход:
 акортС

 Sample Input 1:
 потоп
 Sample Output 1:
 потоп

 Sample Input 2:
 Питон
 Sample Output 2:
 нотиП
*/
public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String source = scanner.next();
        StringBuilder sb = new StringBuilder(source);

        System.out.println(sb.reverse());
    }
}
