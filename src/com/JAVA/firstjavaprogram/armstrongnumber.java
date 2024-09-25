package com.JAVA.firstjavaprogram;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the range a and b
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Call the function to find Armstrong numbers in the given range
        findArmstrong(a, b);
    }

    // Function to find Armstrong numbers between 'a' and 'b'
    static void findArmstrong(int a, int b) {
        // Loop through the numbers from a to b
        for (int i = a; i <= b; i++) {
            int num = i;
            int sum = 0;

            // Find the sum of cubes of digits of the number
            while (num > 0) {
                int remainder = num % 10;  // Get the last digit
                sum = sum + (remainder * remainder * remainder);  // Cube the digit and add to sum
                num = num / 10;  // Remove the last digit
            }

            // Check if the sum of cubes of digits is equal to the original number
            if (sum == i) {
                // Print the Armstrong number
                System.out.println(i);
            }
        }
    }
}
