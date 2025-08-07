package com.JAVA.recursion;

public class nto1 {
    public static void main(String[] args) {
        fun(5);
    }
    public static void fun(int n) {
        //base case
        if (n==0) {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
}
