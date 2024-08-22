package com.JAVA.loopsintermediate;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter string");
        String input = in.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0 ; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("reversed string : " + reversed);
    }
}
