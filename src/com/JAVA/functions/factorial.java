package com.JAVA.functions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();

        fact(num);
    }
    public static void fact(int num) {
        int product = 1;
        for (int i = 1; i <= num ; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
