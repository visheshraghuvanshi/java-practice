import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find weather it is Odd or Even: ");
        int x = sc.nextInt();
        if( x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        if (age >= 14 && age <=; 55) {
            System.out.println("Young");
        } else {
            System.out.println("Not Young");
        }
        System.out.print("Enter Marks: ");
        float marks = sc.nextFloat();
        System.out.print(("Grade: "));
        if (marks <= 25) {
            System.out.println("F");
        } else if (marks <= 40) {
            System.out.println("E");
        } else if (marks <= 60) {
            System.out.println("D");
        } else if (marks <=70) {
            System.out.println("C");
        } else if (marks <= 80) {
            System.out.println("B");
        } else if (marks <= 90) {
            System.out.println("A");
        } else if (marks <= 100) {
            System.out.println("A+");
        } else {
            System.out.println("TNVALID");
        }
    }
}