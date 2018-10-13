package com.telesens.academy.lesson03.classwork03;

import java.util.Scanner;

public class Classwork03_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer, please: n = ");
        int n = scanner.nextInt();

        int res = n % 2;

        switch (res) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }
    }
}
