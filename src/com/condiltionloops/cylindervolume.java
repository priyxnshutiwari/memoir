package com.condiltionloops;

import java.util.Scanner;

public class cylindervolume {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter cylinder's radius");
        double r = in.nextDouble();

        System.out.println("enter cylinder's height");
        double h = in.nextDouble();

        double volume = 22/7 * (r)*(r) * h;

        System.out.println("volume : " + volume);
    }
}
