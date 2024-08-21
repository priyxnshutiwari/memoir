package com.loopsintermediate;

import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        //to find a given number is perfect

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();

        int sumofdivisors = 0;

        for (int i = 1; i < n ; i++) {
            if (n%i == 0) {
                sumofdivisors += i;
            }
        }
        if (sumofdivisors==n) {
            System.out.println("perfect number");
        }
        else {
            System.out.println("not perfect");
        }
    }
}
