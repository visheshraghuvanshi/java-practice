import java.util.Scanner;
public class CalculateArea {

    static float area (float b, float h) {
        return ((b*h)*0.5f) ;
    }

    static int area (int a) {
        return (a*a);
    }

    static int area (int a, int b) {
        return (a*b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Area of :\n1. Triangle \n2. Square\n3. Rectangle\n");
        int choice = scan.nextInt();
        switch (choice) {
            case 1 :
                System.out.print("Enter Base and Height of the triangle: ");
                float base = scan.nextFloat();
                float height = scan.nextFloat();
                System.out.println("Area of the triangle is: " + area(base, height));
                break;
            case 2 :
                System.out.print("Enter size of Side of the square: ");
                int side = scan.nextInt();
                System.out.println("Area of the square is: " + area(side));
                break;
            case 3 :
                System.out.print("Enter length and breadth of the rectangle: ");
                int length = scan.nextInt();
                int breadth = scan.nextInt();
                System.out.println("Area of the square is: " + area(length, breadth));
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}