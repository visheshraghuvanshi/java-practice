import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Display AP Series
        // a + (n-1)d
        Scanner scan = new Scanner(System.in);
        System.out.println("Displaying Arithmetic Progression Series ");
        System.out.print("Enter Starting Number: ");
        int a = scan.nextInt();
        System.out.print("Enter Difference between 2 numbers: ");
        int d = scan.nextInt();
        System.out.print("Enter number of terms: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print((a+((i-1)*d)) + " ");
        }
        System.out.println();

        // Display GP Series
        // a , ar , ar^2 , ar^3 , ....
        System.out.println("Displaying Geometric Progression Series ");
        System.out.print("Enter Starting Number: ");
        a = scan.nextInt();
        System.out.print("Enter Common Ratio between 2 numbers: ");
        int r = scan.nextInt();
        System.out.print("Enter number of terms: ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a = a * r;
        }
        System.out.println();

        // Display Fibonacci Series
        // 0,1,1,2,3,5,8,13,21
        // zeroth term = 0
        int term_zero = 0;
        int term_first = 1;
        int next_term = 0;
        System.out.print("Enter Number of terms: ");
        n = scan.nextInt();
        System.out.print(term_zero + " " + term_first + " ");
        for (int i = 1; i <= n - 2; i++) {
            next_term = term_zero + term_first;
            System.out.print(next_term + " ");
            term_zero = term_first;
            term_first = next_term;
        }
    }
}