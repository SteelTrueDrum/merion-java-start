package com.steeltruedrum.java.merion.practice;

import java.util.Scanner;

/**
 * Задача 3. Факториал числа
 * Напишите программу для вычисления факториала введенного числа.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int input = scanner.nextInt();

        long result = findFactorial(input);
        System.out.println("Факториал числа: " + result);

        scanner.close();
    }

    // Через рекурсию
    private static long findFactorial(int input) {
        if (input == 0) return 1;
        return input * findFactorial(input - 1);
    }
}
