package com.kunal;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        //Q: Find the largest of the 3 numbers
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if( c > max){
//            max = c;
//        }
//
        int max = Math.max(c, Math.max(a, b)); // Math.max will calculate maximum values between a and b

        System.out.println(max);

       // System.out.println(Math.max(32, 432)); // this will also print the maximum value i.e 432 without any conditions


    }
}
