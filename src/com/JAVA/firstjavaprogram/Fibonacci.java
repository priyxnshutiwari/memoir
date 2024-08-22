package com.JAVA.firstjavaprogram;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int term,a=0,b=1,c;

        System.out.println("enter term");

        Scanner r = new Scanner(System.in);
        term=r.nextInt();

        for(int i=1;i<=term;i++) //i=1 2 3..
        {
            System.out.println(a); //a=0 1 1 2 3 5...
            c=a+b; //c=1 2 3 5...
            a=b;   //a=1 1 2 3...
            b=c;   //b=1 2 3 5...
        }
    }
}
