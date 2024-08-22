package com.JAVA.loopsintermediate;

import java.util.Scanner;

public class CGPAprogram {
    public static void main(String[] args) {
        //cgpa=sum grade of all subject/number of subjects
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of subjects : ");
        int n = in.nextInt();
        double sumofgrades = 0;

        for (int i = 1; i <= n ; i++) {
            System.out.println("enter grade of subject"+ i + " :");
            double grade = in.nextDouble();
            sumofgrades += grade;
        }
        double cgpa = sumofgrades/n;
        System.out.println("cgpa : " + cgpa);
    }
}
