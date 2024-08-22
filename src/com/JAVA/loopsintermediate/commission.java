//sales given, commission percentage give, calculate commission
package com.JAVA.loopsintermediate;

import java.util.Scanner;

public class commission {
    public static void main(String[] args) {

        //sales given, commission percentage give, calculate commission
        Scanner in = new Scanner(System.in);

        System.out.println("enter the total sales amount : ");
        double sales = in.nextDouble();

        System.out.println("enter commission percentage : ");
        double cp = in.nextDouble();

        double commission = (sales*cp)/100;
        System.out.println("commission : " + commission);



    }

}
