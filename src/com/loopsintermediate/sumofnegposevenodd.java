package com.loopsintermediate;

import java.util.Scanner;

public class sumofnegposevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumofneg = 0;
        int sumofposeven = 0;
        int sumofposodd = 0;

        System.out.println("Enter numbers (0 to stop)");

        while (true) {
            int number = sc.nextInt();

            if(number==0){
                break;
            }
        
        if (number < 0 ) {
            sumofneg += number;
        } else if (number > 0 && number%2 == 0) {
            sumofposeven += number;
        } else {
            sumofposodd += number;
        }
    }
        System.out.println("sum of negative integers : " + sumofneg);
        System.out.println("sum of even positive integers :  " + sumofposeven);
        System.out.println("sum of odd positive integers : " + sumofposodd);
}
}
