import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // MultiPlication Table
        System.out.print("Which Number's Multiplication table you want? : ");
        int number = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        // Sum of n Numbers
        System.out.print("Enter the number upto which you want sum of: ");
        int number2 = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= number2; i++) {
            sum = sum + i;
        }
        System.out.println("Sum from 1 to " + number2 + " is " + sum);

        //Factorial of a Number
        System.out.print("Enter the Number of which you want to find the factorial: ");
        int number3 = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number3; i++) {
            factorial *= i;
        }
        System.out.print("Factorial of " + number3 + " is " + factorial);
    }
}