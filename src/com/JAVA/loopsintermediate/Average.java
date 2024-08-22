package com.JAVA.loopsintermediate;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter the number of natural numbers to be taken : ");
        int n = in.nextInt();

        int sum = 0;

        for (int i = 1; i <=n ; i++) {
            sum += i;
        }
        System.out.println("the average is :" + sum/n);
    }
}
