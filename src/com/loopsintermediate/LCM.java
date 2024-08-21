package com.loopsintermediate;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter first number : ");
        int num1 = in.nextInt();
        System.out.println("enter second number : ");
        int num2 = in.nextInt();

        int hcf = findhcf(num1,num2);

        int lcm = (num1*num2)/hcf;

        System.out.println("lcm : " + lcm);

    }
    public static int findhcf(int a, int b) {
        while (b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
