package com.firstjavaprogram;

import java.util.Scanner;

public class evenoddnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a number : ");
        int num  = in.nextInt();
        if ( num % 2 == 0) {
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }
    }
}
