package com.academy.telesens.lesson02.homework02;

/*  Релизовать программу возведения числа в квадрат  */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number, please: a = ");
        double a = scanner.nextDouble();

        double square;

        //square
        square=a*a;
        System.out.println(String.format("Square = %f", square));

    }
}


