import java.sql.SQLOutput;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Q: Take input of 2 numbers and print the sum

        Scanner in = new Scanner(System.in);

        // int num1,num2,sum; you can directly give the values here , you do not need to define the integer values separate

        System.out.println("Enter first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of these two numbers are: "+ sum);

    }
}