package com.assignment;

import java.util.Scanner;

public class greetingmessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.next();
        System.out.println("Welcome " + name);
    }
}
