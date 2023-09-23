package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit3;

import java.util.Scanner;

/**
 * Один квадрат
 * Напишите программу, которая на вход принимает одно цело число n в диапазоне от 1 до 100, а на выход подаёт квадрат в виде символов. Грани квадрата обозначены символом X (английская заглавная X), а внутренние части квадрата символом пробел.
 * Не допускаются лишние пробелы вне квадрата.
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
 * X X
 * XXX
 * <p>
 * <p>
 * Sample Input 3:
 * 2
 * Sample Output 3:
 * XX
 * XX
 * <p>
 * <p>
 * Sample Input 4:
 * 4
 * Sample Output 4:
 * XXXX
 * X  X
 * X  X
 * XXXX
 */
public class Task_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("X");
                if (i != 0 && i != n - 1) {
                    int k = 0;

                    while (k < n - 2) {
                        System.out.print(" ");
                        k++;
                    }

                    System.out.print("X");
                    break;
                }
            }
            System.out.println();
        }
    }
}
