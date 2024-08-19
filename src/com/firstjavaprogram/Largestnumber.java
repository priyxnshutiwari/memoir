package com.firstjavaprogram;

import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first and the second number:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b) {
            System.out.println(a + " is greater than " + b);
        }
        else if (a<b)
        {
            System.out.println(b + " is greater than " + a);
        }

    }
}
