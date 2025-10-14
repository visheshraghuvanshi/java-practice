import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Display a number in words with tailing 0
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scan.nextInt();
        String str = "";
        while (number != 0) {
            str = str + number % 10;
            number /= 10;
        }
        for(int i = str.length() - 1; i >= 0 ;i--) {
            switch (str.charAt(i)) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                default:
                    System.out.print("Nine ");
                    break;
            }
        }

    }
}