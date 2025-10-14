import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Finding Sum of all Elements
        // Searching an Element
        // Finding Maximum Element
        //Finding Second Largest Element
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int sum = 0,max,secondMax;
        System.out.print("Enter Elements: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        System.out.print("Enter Element to search: ");
        int search = scan.nextInt();
        if (arr[0] >= arr[1]) {
            max = arr[0];
            secondMax = arr[1];
        } else {
            max = arr[1];
            secondMax = arr[0];
        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] == search) {
                System.out.println(search + " found at index " + i);
            }
        }
        System.out.println("Sum of the array: " + sum);
        System.out.println("Maximum in array: " + max);
        System.out.println("Second Largest in Array: " + secondMax);

    }
}