package com.JAVA.loopsintermediate;

import java.util.Scanner;

public class depreciation {
    public static void main(String[] args) {
        //to calculate depreciation of given value
        //depriciation = (cost of asset - salvage value)/useful life

        Scanner in = new Scanner(System.in);

        System.out.println("Enter cost of asset : ");
        double coa = in.nextDouble();
        System.out.println("enter salvage value : ");
        double sv = in.nextDouble();
        System.out.println("enter useful life : ");
        double ul = in.nextDouble();

        double dpy = (coa-sv)/ul;
        System.out.println("early depreciation value : " + dpy);

        //to display the value of the asset at the end of each year
        for (int year = 1; year <= ul ; year++) {
            double depriciationvalue = coa - (dpy*year);
            System.out.println("value at the end of" + year + "year : " + depriciationvalue);
        }

        
    }
}
