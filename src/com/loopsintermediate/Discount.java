package com.loopsintermediate;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
         //product price and discount percentage to be taken

        Scanner in = new Scanner(System.in);
        System.out.println("enter product's price : ");
        int pp = in.nextInt();
        System.out.println("enter discount percentage(%) : ");
        int dp = in.nextInt();

        int discountamt = (pp*dp)/100;
        int discountprice = pp-discountamt;

        System.out.println("Discount price is : " + discountprice);
    }
}
