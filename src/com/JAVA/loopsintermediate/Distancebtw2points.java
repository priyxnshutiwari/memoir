package com.JAVA.loopsintermediate;

import java.util.Scanner;

public class Distancebtw2points {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter x1 : ");
        double x1 = in.nextDouble();
        System.out.println("enter y1 : ");
        double y1 = in.nextDouble();
        System.out.println("enter x2 :");
        double x2 = in.nextDouble();
        System.out.println("enter y2 :");
        double y2 = in.nextDouble();

        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("distance : " + distance);

    }
}
