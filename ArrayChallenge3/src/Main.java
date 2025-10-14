import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Reverse Copying an Array
        System.out.print("Enter Size of the Array: ");
        int n = scan.nextInt();
        System.out.print("Enter Elements of the Array: ");
        int[] arr = new int[n];
        int[] revArr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            revArr[n - i - 1] = arr[i];
        }
        System.out.println("Reverse of the given array: ");
        for(int element : revArr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Copying an Array
        int[] copyArr = new int[n];
        for (int i = 0; i < n; i++) {
            copyArr[i] = arr[i];
        }
        System.out.print("Copied Array: ");
        for (int element : copyArr) {
            System.out.print(element + " ");
        }
        System.out.println();
        // Increasing Size of an Array
        // Can't Increase directly so make a new one
        System.out.print("Increase Array size by: ");
        int inc = scan.nextInt();
        int[] arr2 = new int[arr.length + inc];
        System.out.println("Old Array Size: " + arr.length);
        arr = arr2;
        arr2 = null;
        System.out.println("Nwe Array Size: " + arr.length);
    }
}