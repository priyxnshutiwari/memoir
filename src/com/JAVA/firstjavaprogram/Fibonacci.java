package com.JAVA.firstjavaprogram;

import java.util.Scanner;
//program displays the nth fibonacci number
public class Fibonacci {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a = 0;
       int b = 1;
       int count = 2; //we already have our first two nos so our count can start from 2

        while (count<=n) {
            int temp = b;
            b = b+a; //b is updated to whatever next number we have added
            a = temp; //a is updated to b
            count++;
        }
        System.out.println(b);
    }
}
