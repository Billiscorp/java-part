package com.academy.telesens.lesson02.homework02;

/*  Реализовать программу ввода числа x с клавиатуры и вывода значения: x - 5%  */

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number, please: x = ");
        double x = scanner.nextDouble();

        double res;

        res = x - x*0.05;
        System.out.println(String.format("x - 5 %% = %.2f", res));

    }
}


