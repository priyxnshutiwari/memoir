package com.assignment;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//This calls in inputs from the computer

        int fnum,snum,ans;
        char sign;  //THIS ASSIGNS THE CHARACTER VARIABLE + - * /

        // My First Introduction word in the program
        System.out.println("Welcome User,This is a Simple Calculator Created by Victor Using the if statement");

        System.out.print("Please Enter your first digit: ");

        fnum=input.nextInt(); /*This receive input from user
		it receive the first number*/

        System.out.print("Enter the second digit: ");
        snum=input.nextInt();
		/*This receive input from user
		it receive the second number*/

        System.out.print("Enter the mathematical operator to be used: "); //Ask the user to input the mathematical operator to be used
        sign=input.next().charAt(0); //Receive input from user
        if (sign == '+' )/*making use of if statement to determine the addition sign*/{
            ans=fnum + snum;
            System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
        }
        else if(sign == '-')/* else if statement for minus sign*/
        {
            ans=fnum-snum;
            System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
        }
        else if(sign == '/'){
            ans=fnum/snum;
            System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
        }
        else if(sign == '*'){
            ans=fnum*snum;
            System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
        }
        else

            System.out.println("Your Input is not correct,please check it for any error(s).");



    }

}
