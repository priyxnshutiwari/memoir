package com.assignment;

public class armstrong {
    public static void main(String[] args) {

        String str = "level";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.toLowerCase().equals(rev.toLowerCase()))
        {
            System.out.println("palindrome string");
        } else {
            System.out.println("not palindrome");
        }
    }
}
