package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit1;

import java.util.Scanner;

/**
 * Простая задача.
 * На вход подаётся список из 10 целых чисел - в одной строке через пробел. Каждое число лежит в диапазоне [0, 100].
 * Нужно проводить суммирование этих чисел пока сумма не превысит заданный предел N, который лежит в диапазоне [0, 100].
 * Напишите программу, которая будет находить номер числа (счёт начинается с единицы), начиная с которого сумма превысит N.
 * Если после суммирования всех чисел строки не наберётся сумма большая N, то нужно вывести -1.
 * <p>
 * На вход подаются две строки:
 * - в первой строке целое число N - предел, который нужно превысить,
 * - во второй строке 10 целых чисел из диапазона [0, 100].
 * На выход подайте ответ - номер числа, на котором произойдёт превышение N (счёт чисел идёт с единицы).
 * <p>
 * Пример:
 * Вход:
 * 100
 * 50 30 20 1 2 3 4 5 6 7
 * Выход:
 * 4
 * <p>
 * Sample Input 1:
 * 100
 * 50 30 20 1 2 3 4 5 6 7
 * Sample Output 1:
 * 4
 * <p>
 * <p>
 * Sample Input 2:
 * 1
 * 5 5 5 5 5 5 5 5 5 5
 * Sample Output 2:
 * 1
 * <p>
 * <p>
 * Sample Input 3:
 * 100
 * 5 5 5 5 5 5 5 5 5 5
 * Sample Output 3:
 * -1
 */
public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        int i = 1;

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();

            if (sum > n) {
                System.out.println(i);
                return;
            }

            i++;
        }

        System.out.println(-1);
    }
}
