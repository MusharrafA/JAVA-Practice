
import java.util.Scanner;
public class Main {


    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//c click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {}
//  a  public static void main(String[] args) {
//   g     //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    e    // to see how IntelliJ IDEA suggests fixing it.
//         System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//    }}
//  public class Main{
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//        if(fruit.equals("mango")){
//            System.out.println("king of fruit");
//        }
//        if (fruit.equals("apple")) {
//
//            System.out.println("a sweet red fruit");
//        }
//    }
//
//}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//    String fruit = in.next();
//
//
//    switch (fruit){
//        case "Mango":
//            System.out.println("King of fruits");
//            break;
//        case "Apple":
//            System.out.println("A sweet red fruit");
//            break;
//        case "Orange":
//            System.out.println("A orange fruit");
//            break;
//        case "Grapes":
//            System.out.println("Small size fruit");
//            break;
//        default:
//            System.out.println("Please enter a valid fruit");
//    }
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday"); // already Break; is here
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        // This is old style code
//    int day = in.nextInt();
//    switch (day) {
//        case 1:
//            System.out.println("Monday");
//            break;
//        // already Break; is here
//        case 2:
//            System.out.println("Tuesday");
//            break;
//        case 3:
//            System.out.println("Wednesday");
//            break;
//        case 4:
//            System.out.println("Thursday");
//            break;
//        case 5:
//            System.out.println("Friday");
//            break;
//        case 6:
//            System.out.println("Saturday");
//            break;
//        case 7:
//            System.out.println("Sunday");
//            break;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }
    }
}
