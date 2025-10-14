import java.util.Scanner;
public class ReverseIntegerAndArray {

    static int reverse (int a) {
        int r = 0;
        while (a!=0) {
            r *= 10;
            r += a % 10;
            a = a/10;
        }
        return r;
    }

    static void reverse (int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        System.out.println("The Reverse of " + n + " is " + reverse(n));
        System.out.println();

        System.out.print("Enter the Size of the Array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the Elements of the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        reverse(arr);
        System.out.println("The Reverse of the Array is: ");
        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}
