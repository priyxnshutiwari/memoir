package com.loopsintermediate;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an year : ");
        int year = sc.nextInt();

        if ((year%4==0 && year%100 !=0) || (year%400==0)) {
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
