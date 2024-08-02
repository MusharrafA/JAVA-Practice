package com.kunal;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*always left value is greater than right one float>>>Integer
         * if I right
         * int num = input.nextFloat(); so it will gives me error because left side is smaller*/
        //      float num = input.nextFloat(); /* hamesha left wali value greater hona chahiye right se like float is greater>>> than Integers*/
//        int num = input.nextFloat();;/*This will give error because it will type cast means the value of left hand side is always greater than right side */
        //      System.out.println(num);

        //Type casting
        //       int sum = (int)(45.456f);
        //       System.out.println(num);

        // automatically type promotion in expression
//        int a = 257;
        //       byte b = (byte) (a);
        //       System.out.println(b); /*it will gives 1*/


//        byte a = 40;
//        byte b = 50;
//        byte c = 60;
//        int d = a * b / c;
//        System.out.println(d);

        // it will give ASCII values
//        int number = 'A';
//        System.out.println(number); // koi bhi unicode value le sakta hai java
//

        //  System.out.println(3 * 64.64); // it will give

// we can do sum of any data types
        byte b = 43;
        char c = 'a';
        short s = 2432;
        int i = 56787;
        float f = 5.76f;
        double d = 0.516;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
