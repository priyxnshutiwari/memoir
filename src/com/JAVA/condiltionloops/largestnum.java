package com.JAVA.condiltionloops;

import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println("enter a number : ");
            number = sc.nextInt();
        } while (number != 0);
        System.out.println("largest number is  : "+ number);
    }
}
