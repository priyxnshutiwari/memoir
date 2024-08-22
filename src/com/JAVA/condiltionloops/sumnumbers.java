package com.JAVA.condiltionloops;

import java.util.Scanner;

public class sumnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, total = 0;

        do {
            System.out.println("enter a number : ");
            number = sc.nextInt();
            total = total + number;
        } while (number != 0);
        System.out.println("sum total is : " + total);
    }
}