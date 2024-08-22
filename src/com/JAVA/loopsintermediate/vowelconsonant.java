package com.JAVA.loopsintermediate;

import java.util.Scanner;

public class vowelconsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter string : ");
        String input = in.nextLine();

        input = input.toLowerCase();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            } else if (ch >= 'a' && ch<= 'z') {
                consonants++;
            }
        }
        System.out.println("number of vowels : " + vowels);
        System.out.println("number of consonant : " + consonants);
    }
}
