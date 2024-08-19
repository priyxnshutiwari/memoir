package com.firstjavaprogram;

import java.util.Scanner;

public class simpleinterest {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter principal: ");
            double p = in.nextDouble();
            System.out.print("Enter rate: ");
            double r = in.nextDouble();
            System.out.print("Enter time: ");
            int t = in.nextInt();
            double si = p * r * t / 100;
            System.out.println("Simple Interest: " + si);
    }
}
