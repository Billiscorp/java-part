package com.academy.telesens.lesson02.homework02;

/*  Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая
		вычислила бы ваш вес на Луне.  */

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight, please: ");
        System.out.println("Your weight on the moon = " + scanner.nextDouble()*0.17);


    }
}

