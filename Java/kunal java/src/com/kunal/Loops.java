package com.kunal;

import java.util.Scanner;


public class Loops {

    public static void main(String[] args) {


        /* Q: print numbers from 1 to 5
        // System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);

        /*
        Syntax of for loops:

        for(initialization; condition; increment/decrement){
        // body
        }
         */

//        // Q: Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num +=1 ){
//            System.out.println(num);
//        }
//
//        // Q:
//        for( int num = 1; num <=5 ; num +=2){
//            System.out.println(num);
//        }

        // Print numbers from 1 to n
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
//            for(int num = 1; num <= n; num++){
//                System.out.println("Enter The Numbers You Want to Print :" + num );
//                System.out.println("Hello World!");
//            }
        // While loops
        /*Syntax:
        while (condition){
         body}
        */
        //    for (int num = 1; num <= 5; num +=1 ){
//            System.out.println(num);
//        int num =1;
//        while (num <= 5){
//            System.out.println(num);
//            num +=1;
//        }

        // do while
        /*
        the loop is going to execute at least one time because firstly
        loop will run after that the condition will executed
         do{
         } while(Condition)
         */
        int a =1;
        do {
            System.out.println("Hello world"
            );
        } while (a != 1);

    }
}
