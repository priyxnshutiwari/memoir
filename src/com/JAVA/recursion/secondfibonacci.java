package com.JAVA.recursion;

public class secondfibonacci {
    public static void main(String[] args) {
        int ans = fibo(7);
        System.out.println(ans);
    }
    static int fibo(int n) {
        //base condition
        if (n<2) { //for 1 and 0
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
