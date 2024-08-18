package com.assignment;

import java.util.Scanner;

public class currencyconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount in rupee: ");
        int a = sc.nextInt();

        double b = a * 0.012;

        System.out.println("Amount in USD is :" + b);
    }
}
