package com.condiltionloops;

import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter radius : ");
        float r = in.nextFloat();

        System.out.println("Area of circle is : " + (22/7 * r*r));
    }
}
