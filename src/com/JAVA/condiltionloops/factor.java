package com.JAVA.condiltionloops;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number");
        int num = in.nextInt();

        for (int i = 2; i < num ; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            }
            }
        }
