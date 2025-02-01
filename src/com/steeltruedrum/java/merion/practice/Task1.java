package com.steeltruedrum.java.merion.practice;

import java.util.Scanner;

/**
 * Задача 1. Площадь прямоугольника
 * Напишите программу для вычисления площади прямоугольника по заданным длине и ширине.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую сторону: ");
        double sideA = scanner.nextDouble();
        System.out.print("Введите вторую сторону: ");
        double sideB = scanner.nextDouble();

        System.out.print("Площадь прямоугольника равна: ");
        System.out.println(calculateArea(sideA, sideB));

        scanner.close();
    }

    public static double calculateArea(double sideA, double sideB) {
        return sideA * sideB;
    }
}
