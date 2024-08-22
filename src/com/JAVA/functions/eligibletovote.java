package com.JAVA.functions;

import java.util.Scanner;

public class eligibletovote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age : ");
        int age = sc.nextInt();

        checker(age);
    }
    public static void checker(int age) {
        if (age>18) {
            System.out.println("eligible to vote");
        }
        else {
            System.out.println("not eligible to vote");
        }
    }
}
