package com.telesens.academy.lesson02.homework02;

/*
15.
Нарисовать квадрат заданной размерности. Пример для размера 4:
****
*  *
*  *
****

*/

import java.util.Scanner;

public class Homework02_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an natural number, please: n = ");
        int n = scanner.nextInt();
        System.out.print("Enter a character, please: m = ");
        String m = scanner.next();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                for (int z=0; z<n-1; z++) {
                System.out.print(" ");}
                System.out.print(m);
            }
            System.out.print("\n");
        }


      /*  for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(m);
            }
            System.out.print("\n");
        }*/

    }



}
