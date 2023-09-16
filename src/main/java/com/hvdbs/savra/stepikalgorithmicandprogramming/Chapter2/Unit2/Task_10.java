package com.hvdbs.savra.stepikalgorithmicandprogramming.Chapter2.Unit2;

import java.util.*;

/**
 * На вход подаётся 21 строка:
 * - в первой строке - целое число N из диапазона [1; 20];
 * - в последующих 20-ти строках записаны данные про языки программирования в таком формате:
 * название;рейтинг
 * В качестве разделителя используется символ ";".
 * Рейтинг - это вещественное число из диапазона от [0.00; 100.00].
 * Рейтинги всех языков программирования различны.
 * <p>
 * Входной поток данных не отсортирован.
 * <p>
 * На выход подайте:
 * - название языка программирования, находящегося на позиции N, если список отсортировать по убыванию рейтинга.
 * Позиции нумеруются начиная с единицы.
 * <p>
 * Sample Input:
 * 1
 * C++;2.49
 * PHP;8.7
 * JavaScript;4.44
 * Visual Basic;8.52
 * Perl;10.99
 * SQL;1.9
 * Objective-C;0.66
 * Groovy;4.92
 * Java;5.32
 * MATLAB;10.38
 * Swift;6.0
 * Ruby;11.49
 * PL/SQL;1.24
 * R;7.21
 * Go;9.54
 * Python;6.72
 * C;0.7
 * Assembly language;8.55
 * C#;11.6
 * Classic Visual Basic;7.61
 * <p>
 * Sample Output:
 * C#
 */
public class Task_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        List<Map.Entry<String, Double>> res = new ArrayList<>();

        while (s.hasNextLine()) {
            String[] str = s.nextLine().split(";");
            res.add(new AbstractMap.SimpleEntry<>(str[0], Double.parseDouble(str[1])));
        }

        res.sort(Comparator.comparingDouble((Map.Entry<String, Double> v) -> v.getValue()).reversed());
        System.out.println(res.get(n - 1).getKey());
    }
}
