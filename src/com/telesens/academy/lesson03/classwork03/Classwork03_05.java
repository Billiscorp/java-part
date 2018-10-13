package com.telesens.academy.lesson03.classwork03;

import java.util.Scanner;

public class Classwork03_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer, please: n = ");
        int n = scanner.nextInt();

        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++){
                sum = sum + i;
            }

            System.out.print("Sum  = " + sum);
        } else {
            System.out.print("Incorrect data");
        }


    }
}
