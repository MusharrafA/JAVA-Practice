package com.kunal;
//this program will reverse the given numbers and string also and print the reverse numbers we just do...

// n= 23597
//7*10 + 9= 79
//79*10 + 5 = 795
//795*10 + 3= 7953.......

public class ReverseNums {
    public static void main(String[] args) {
        int num = 23579;

        int ans = 0;
        while(num>0){
            int rem = num %10;
            num /= 10;

            ans = ans * 10 +rem;
        }
        System.out.println(ans);

    }
}
