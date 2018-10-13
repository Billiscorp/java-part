package com.academy.telesens.lesson01.inclass01;

public class AppMain {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(args[0]);
        // System.out.println(args[0]);

        if (args.length == 1) {
            String name = args[0];
            System.out.println("Happy New Year " + name + "!");
        }
        else
            System.out.println("Happy New Year!");
    }
}
