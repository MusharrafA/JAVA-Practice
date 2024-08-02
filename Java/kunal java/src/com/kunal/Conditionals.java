package com.kunal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Conditionals {
    public static void main(String[] args) {
        /*
         * Syntax of if statement;
         * if(boolean expression T or F ){
         * // body
         *
         * }
         * else{
         * // do this}
         * */

        int salary = 30000;
        //     if( salary > 10000){
        //          salary = salary + 2000;
        //     } else {
        //          salary = salary + 1000;
//        }

        // multiple if-else

        if(salary > 10000){
            salary += 2000;      // salary = salary +2000
        } else if (salary > 2000){
            salary += 3000;
        } else{
            salary += 1000;
        }



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}

