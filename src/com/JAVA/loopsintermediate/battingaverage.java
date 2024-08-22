package com.JAVA.loopsintermediate;

import java.util.Scanner;

public class battingaverage {
    public static void main(String[] args) {
        //batting avg = total runs scored/number of times out

        Scanner in = new Scanner(System.in);
        System.out.println("total runs scored by the player : ");
        int runs = in.nextInt();
        System.out.println("number of times out : ");
        int out = in.nextInt();

        if (out==0) {
            System.out.println("the player has never been out, so batting average cant be calculated");
        } else {
            double battingavg = runs/out;
            System.out.println("batting average : " + battingavg);
        }
    }
}
