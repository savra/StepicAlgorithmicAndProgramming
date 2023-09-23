package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit3;

import java.util.Scanner;

/**
 * Вертикальные линии
 * На вход в одной строке через пробел подаются два целых числа N и M (в диапазоне от 1 до 100).
 * <p>
 * На выход подайте имитацию из M вертикальных линий высотой N строк. Линии составлены из символов 'X'. Между линиями символ пробел.
 * <p>
 * Не допускаются лишние пробелы за пределами фигуры.
 * <p>
 * Sample Input 1:
 * 1 3
 * Sample Output 1:
 * X X X
 * <p>
 * <p>
 * Sample Input 2:
 * 2 3
 * Sample Output 2:
 * X X X
 * X X X
 */
public class Task_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("X");

                if (j != m - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
