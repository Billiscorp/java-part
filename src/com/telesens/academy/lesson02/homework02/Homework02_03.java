package com.academy.telesens.lesson02.homework02;

        /*   Инициализировать две переменные. Поменять их значения местами   */

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer, please: a = ");
        int a = scanner.nextInt();
        System.out.print("Enter an integer, please: b = ");
        int b = scanner.nextInt();

        int c;
        c=a;
        System.out.println(String.format("Now a = %d", a=b));
        System.out.println(String.format("Now b = %d", b=c));

    }

}
