import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Rotating an Array
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Left Rotating the array
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n - 1] = temp;
        System.out.print("Left Rotated Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        // Right Rotating the array
        temp = arr[n - 1];
        for (int i = n - 1; i >= 1 ; i--) {
            arr[i] = arr [i - 1];
        }
        arr[0] = temp;
        System.out.print("Right Rotated Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Inserting an Element
        System.out.print("Enter the size of the array: ");
        n = scan.nextInt();
        int[] arr2 = new int[n + 1];
        System.out.print("Enter Elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = scan.nextInt();
        }
        System.out.print("Enter number to insert: ");
        int num = scan.nextInt();
        System.out.print("Enter index: ");
        int index = scan.nextInt();

        for (int i = n; i > index; i--) {
            arr2[i] = arr2[i - 1];
        }

        arr2[index] = num;
        System.out.print("Modified Array: ");
        for (int element : arr2) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Deleting an Element
        System.out.print("Enter the size of the array: ");
        n = scan.nextInt();
        int[] arr3 = new int[n];
        System.out.print("Enter Elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr3[i] = scan.nextInt();
        }
        System.out.print("Enter index to delete: ");
        index = scan.nextInt();

        for (int i = index; i < n - 1; i++) {
            arr3[i] = arr3[i + 1];
        }
        System.out.print("Modified Array: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}