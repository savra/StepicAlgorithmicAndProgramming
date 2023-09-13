package com.hvdbs.savra.stepicalgorithmicandprogramming.Chapter1.Unit2;

import java.util.Scanner;

/**
На вход подаётся одна строка длиною не более 100 символов.
На выход подайте первый символ строки.

Например.
Вход:
Строка
Выход:
С

Sample Input:
Python
Sample Output:
P

*/
public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next().charAt(0));
    }
}
