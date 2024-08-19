package com.firstjavaprogram;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        findarmstrong(a,b);

    }
        static void findarmstrong(int a, int b)  //this is a method/function
        {
            for(int i = a; i<=b; i++)
            {
                int num=i;
                int sum=0;

                while(num>0){
                    int remainder = num%10;
                    sum = sum + (remainder*remainder*remainder);
                    num=num/10;

                }
                if(sum==i){
                    System.out.println("sum");
                }
            }
    }
        }
