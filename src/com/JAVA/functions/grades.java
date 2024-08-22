package com.JAVA.functions;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your marks : ");
        int marks = sc.nextInt();

        gradecalc(marks);

    }
    public static void gradecalc(int marks) {
        switch (marks / 10) {
            case 10, 9 -> System.out.println("Your grade is: AA");
            case 8 -> System.out.println("Your grade is: AB");
            case 7 -> System.out.println("Your grade is: BB");
            case 6 -> System.out.println("Your grade is: BC");
            case 5 -> System.out.println("Your grade is: CD");
            case 4 -> System.out.println("Your grade is: DD");
            default -> {
                if (marks >= 0 && marks <= 40) {
                    System.out.println("Your grade is: Fail");
                } else {
                    System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
                }
            }
        }
    }
}
