package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter1.Unit2;

import java.util.Scanner;

/**
 На вход подаётся одна строка длиною не менее двух и не более 100 символов.
 На выход подайте первые два символа строки, написанные без пробела.

 Например.
 Вход:
 Строка
 Выход:
 Ст

 Sample Input 1:
 Пи=3.14159
 Sample Output 1:
 Пи

 Sample Input 2:
 Python
 Sample Output 2:
 Py
*/
public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println(s.substring(0, 2));
    }
}
