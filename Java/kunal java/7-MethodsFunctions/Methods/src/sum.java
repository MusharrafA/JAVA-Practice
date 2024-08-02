import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
 //      int ans = sum2();
  //      System.out.println(ans);
        int ans =sum3(20 , 30);
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a+ b;
        return sum;
    }
    // return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
//        System.out.println("This will never executed");

    }


    // void is return type here
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of these two numbers are: "+ sum);

    }
    /*

                    access modifier (we'll look in oop)
    return_type name(){
          //body
          return statement;
    }

     */
}
