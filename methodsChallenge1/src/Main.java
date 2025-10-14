import java.util.Scanner;
public class Main {

    static boolean primeCheck (int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int findGCD (int a, int b) {
        int flag = -1;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = 1; i <= b; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                flag = i;
            }
        }
        return flag;
    }

    static int maxInArray (int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        // Find if a Number is Prime
        System.out.print("Enter a Number to check prime: ");
        int number1 = scan.nextInt();
        System.out.println(number1 + " is Prime : " + primeCheck(number1));

        // Find GCD of 2 Numbers
        System.out.print("Enter two Numbers to find their GCD: ");
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        System.out.println("GCD of " + number2 + " and " + number3 + " = " + findGCD(number2, number3));

        // Find Max Element in an Array
        System.out.print("Enter the length of the Array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Elements of the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Maximum of the array is: " + maxInArray(arr));
    }
}