package com.loopsintermediate;

public class evendaysinaugust {
    public static void main(String[] args) {
        int evendays = 0;
        for (int i = 1; i <= 31 ; i++) {
            if (i%2==0) {
                evendays += 1;
            }
        }
        System.out.println("no of even days : " + evendays);
    }
}
