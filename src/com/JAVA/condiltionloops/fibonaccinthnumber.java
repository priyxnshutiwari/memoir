package com.JAVA.condiltionloops;

import java.util.Scanner;

public class fibonaccinthnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the nth term : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count =2;

        while (count<=n) {
            int temporary = b;
            b=b+a;
            a=temporary;
            count++;
        }
        System.out.println("the nth number is : " + b);
    }
}
