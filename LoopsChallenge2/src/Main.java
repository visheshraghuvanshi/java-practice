import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Display Digits of a Number & Count Digits of a Number & Reverse a Number
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scan.nextInt();
        int reverse = 0;
        System.out.print("Digits : ");
        int digit_count = 0;
        while (number != 0) {
            reverse *= 10;
            System.out.print(number % 10 + " ");
            reverse += (number % 10);
            number = number / 10;
            digit_count += 1;
        }
        System.out.println();
        System.out.println("The number of digits = " + digit_count);
        System.out.println("The Reverse of the number is " + reverse);

        // Finding a number is Armstrong or not
        System.out.print("Enter Number to check Armstrong Number: ");
        int number2 = scan.nextInt();
        int temp = number2;
        int sum = 0;
        while (temp != 0) {
            sum += ((temp % 10)*(temp % 10)*(temp % 10));
            temp = temp / 10;
        }
        if (sum == number2) {
            System.out.println(number2 + " is an Armstrong Number");
        } else {
            System.out.println(number2 + " is not an Armstrong Number");
        }

        // Check a number is a palindrome
        System.out.print("Enter Number to check Palindrome Number: ");
        int number3 = scan.nextInt();
        temp = number3;
        reverse = 0;
        while (temp != 0) {
            reverse *= 10;
            reverse += (temp % 10);
            temp = temp / 10;
        }
        if (reverse == number3) {
            System.out.println("The number " + number3 + " is a Palindrome Number");
        } else {
            System.out.println("The number " + number3 + " is not a Palindrome Number");
        }
    }
}