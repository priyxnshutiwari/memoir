package com.loopsintermediate;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter first number : ");
        int num1 = in.nextInt();
        System.out.println("enter second number : ");
        int num2 = in.nextInt();

        //euclid theory to be applied

        int hcf = findhfc(num1, num2);

        System.out.println("HCF :" + hcf);
    }

    public static int findhfc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}