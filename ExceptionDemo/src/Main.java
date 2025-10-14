import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of a: ");
        a = sc.nextInt();
        System.out.print("Enter Value of b: ");
        b = sc.nextInt();

        try {
            c = a / b;
            System.out.print("a / b = ");
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0, try again");
        } finally {
            System.out.println("Bye");
            }
    }
}