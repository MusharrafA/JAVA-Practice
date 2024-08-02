package com.Main;

public class Main {

    public static void main(String[] args) {
        /*
          Syntax of if statements:
          if (Boolean expression T or F){
          // body
          } else{
          // Do This
          }
        * */

        int salary = 25400;
        if (salary > 100000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.print(salary);
    }
}