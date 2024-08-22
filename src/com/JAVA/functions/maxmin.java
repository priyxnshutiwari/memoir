package com.JAVA.functions;

import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;

        System.out.println("enter first number");
        num1 = sc.nextInt();
        System.out.println("enter second number");
        num2 = sc.nextInt();
        System.out.println("enter third number");
        num3 = sc.nextInt();

        int max = max(num1,num2,num3);
        int min = min(num1,num2,num3);

        System.out.println("Largest number :" + max);
        System.out.println("Smallest number : " + min);
    }
    public static int max(int num1, int num2 , int num3) {
        int max = num1;
        if (num2>max) {
            max=num2;
        }
        if (num3>max) {
            max = num3;
        }
        return max;
    }

    public static int min(int num1,int num2, int num3) {
        int min = num1;
        if(num2<min) {
            min = num2;
        }
        if (num3<min) {
            min = num3;
        }
        return min;
    }
}

