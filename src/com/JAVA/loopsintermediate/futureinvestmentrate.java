package com.JAVA.loopsintermediate;

import java.util.Scanner;

public class futureinvestmentrate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter principal amount : ");
        double principal = in.nextDouble();

        System.out.println("enter annual interest rate : ");
        double r = in.nextDouble();

        System.out.println("enter number of years : ");
        int y = in.nextInt();

        double futureamount = principal*Math.pow((1 + r/100),y);

        System.out.println("future value : " + futureamount);
    }
}
