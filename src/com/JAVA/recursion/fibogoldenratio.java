package com.JAVA.recursion;

public class fibogoldenratio {
    public static void main(String[] args) {
        //prints 50th fibonacci number
        System.out.println(fiboformula(50));
    }
    static int fiboformula(int n) {
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
