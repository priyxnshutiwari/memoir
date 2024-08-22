package com.JAVA.loopsintermediate;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

//        For the first 100 units: Rs.150 per unit
//        For the next 100 units (101-200 units): Rs.200 per unit
//        For units above 200: Rs.300 per unit

        Scanner in = new Scanner(System.in);

        System.out.println("enter number of units consumed: ");
        int units = in.nextInt();

        double bill = 0;

        if (units < 100) {
            bill = units * 150;
        } else if (units <= 200) {
            bill = (100 * 150) + (units - 100) * 200;
        } else {
            bill = (100 * 150) + (100 * 200) + (units - 200) * 300;
        }
        System.out.println("Electricity Bill Amount: " + bill);
    }
}