package com.telesens.academy.lesson03.classwork03;

import java.util.Scanner;

public class Classwork03_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size, please: size = ");
        int size = scanner.nextInt();

        if (size > 0) {


            int[] array1 = new int[size];
            for (int i = 0; i < size; i++){
                array1[i] = i+1;
                System.out.println("i  = " + array1[i]);
            }

            for (int i = size-1; i >=0; i--){
//                array1[i] = i;
                System.out.println("i  = " + array1[i]);
            }


        } else {
            System.out.print("Incorrect data");
        }


    }
}
