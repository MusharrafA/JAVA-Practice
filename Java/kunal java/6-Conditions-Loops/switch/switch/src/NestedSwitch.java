import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Musharraf");
                break;
            case 2:
                System.out.println("Kunal kush");
                break;
            case 3:
                System.out.println("Employee no three");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }

        // Better way to write by "Enhance code"
        switch (empID) {
            case 1 -> System.out.println("Musharraf");
            case 2 -> System.out.println("Kunal kush");
            case 3 -> {
                System.out.println("Employee no three");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
