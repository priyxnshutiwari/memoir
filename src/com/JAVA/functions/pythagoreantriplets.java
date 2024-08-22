package com.JAVA.functions;

import java.util.Scanner;

public class pythagoreantriplets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("Enter third number: ");
        c = sc.nextInt();

        if (checkTriplet(a, b, c)) {
            System.out.println("The numbers form a Pythagorean triplet.");
        } else {
            System.out.println("The numbers do not form a Pythagorean triplet.");
        }
    }

    public static boolean checkTriplet(int a, int b, int c) {

        int max = Math.max(a, Math.max(b, c));
        int x, y;

        if (max == a) {
            x = b;
            y = c;
        } else if (max == b) {
            x = a;
            y = c;
        } else {
            x = a;
            y = b;
        }


        return (max * max) == (x * x + y * y);
    }
}
