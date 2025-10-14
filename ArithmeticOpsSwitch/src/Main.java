import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("MENU\nAdd\nSubtract\nMultiply\nDivide\n\n");
        System.out.println("Enter 2 Numbers: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.print("Enter Option in Words: ");
        scan.nextLine();
        String option = scan.nextLine();
        switch (option) {
            case "Add":
                System.out.println("Addition: " + (a + b));
                break;
            case "Subtract":
                System.out.println("Subtraction: " + (a - b));
                break;
            case "Multiply":
                System.out.println("Multiplication: " + (a * b));
                break;
            case "Divide":
                System.out.println("Division: " + (a / b));
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}