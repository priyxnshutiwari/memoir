package com.condiltionloops;

import java.util.Scanner;

public class eqtrianglearea {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter the length of its side");
        double s = in.nextDouble();

        Double area = 0.43301270189 * (s)*(s);

        System.out.println("area of the given equilateral triangle is : " + area);


    }
}
