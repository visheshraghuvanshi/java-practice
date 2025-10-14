import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Final Message");
        }


    }
}