package com.hvdbs.savra.stepicalgorithmicandprogramming.Chapter1.Unit2;

import java.util.Scanner;

/**
 На вход подаётся одна строка, в которой через пробел записаны два целых числа из диапазона [0, 1000].
 На выход подайте большее из этих чисел.

 Sample Input 1:
 9 9
 Sample Output 1:
 9

 Sample Input 2:
 999 0
 Sample Output 2:
 999
*/
public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] source = scanner.nextLine().split(" ");
        int n1 = Integer.parseInt(source[0]);
        int n2 = Integer.parseInt(source[1]);

        System.out.println(n1 > n2 ? n1 : n2);
    }
}
