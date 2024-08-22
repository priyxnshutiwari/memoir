package com.JAVA.condiltionloops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num = in.nextInt();
        int product=1;

        //factorial 4 = 1*2*3*4

        for (int i = 1; i <= num; i++) {
            product = product * i;
        }
        System.out.println("factorial of the given number is " + product);


    }
}
