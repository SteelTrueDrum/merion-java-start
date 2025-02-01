package com.steeltruedrum.java.merion.practice;

import java.util.Scanner;

/**
 * Задача 2. Проверка на четность числа
 * Напишите программу, которая проверяет, является ли введенное число четным или нечетным.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int input = scanner.nextInt();
        boolean result = isEven(input);
        if (result) {
            System.out.println("Введенное число четное");
        } else {
            System.out.println("Введенное число нечетное");
        }

        scanner.close();

    }

    public static boolean isEven(int input) {
        return input % 2 == 0;
    }
}
