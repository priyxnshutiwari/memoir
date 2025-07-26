package com.JAVA.recursion;
//1. most imp for dynamic programming
//2. youll feel like youre never getting it. just practise
//3. undrstand recursion via given steps. in 2 weeks youll get it
//4. prereq- functions and memory management
public class firstprint5nos {
    //a fn takes in numbers and print it
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n) {
        if (n==5) { //THIS IS THE BASE CONDITION (it is the ans that is alredy given. here 5) (it limits the function si it doesnt runn till infinity as functions are being called infinitevely in the stack (STACK OVERFLOW)
            System.out.println(5); // to print 5
            return; //to print only till 5
        }
        System.out.println(n); //to print 1
        //Tail Recursion/as fn call is at the last
        print(n+1); //RECURSIVE CALL //to print 2 3 4
    }
}
//HOW TO UNDERSTAND AND APPROACH A PROBLEM
/* 1-break problem into smaller problems
2- write the recursion relation if needed
3- draw the tree
4-ABOUT THE TREE:
  a-see the flow of function,
  b- identify anf flow on left tree calls and write tree calls
  c-draw the tree and pointer again and again using pen paper
  d- use a debugger to see the flow
5- see how the values are returned in each step and the what type of value
   see where the function call will come out of
   and in the end youll come out of the main function
 */