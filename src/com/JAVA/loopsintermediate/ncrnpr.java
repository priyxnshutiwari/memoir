package com.JAVA.loopsintermediate;

import java.util.Scanner;

public class ncrnpr {

        //nCr = n!/r!(n-r)!
        //nPr = n!/(n=p)!

    // Helper function to calculate factorial
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Input values for n and r
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter value of r: ");
        int r = scanner.nextInt();

        // Check if n >= r to ensure calculations are valid
        if (n >= r) {
            // Calculate nCr and nPr
            long nCr = factorial(n) / (factorial(r) * factorial(n - r));
            long nPr = factorial(n) / factorial(n - r);

            // Display the results
            System.out.println("nCr (Combinations) = " + nCr);
            System.out.println("nPr (Permutations) = " + nPr);
        } else {
            System.out.println("n must be greater than or equal to r.");
        }

        // Close the scanner object
        scanner.close();
    }
}






