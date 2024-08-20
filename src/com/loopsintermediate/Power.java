package com.loopsintermediate;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        //to create exponential or power of a number
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number : ");
        double n = in.nextDouble();
        System.out.println("enter exponent : ");
        int e = in.nextInt();

         double power = Math.pow(n,e);

        System.out.println("answer is : " + power);

    }
}
