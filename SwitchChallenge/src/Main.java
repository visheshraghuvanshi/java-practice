import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Display name of a day based on number
        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter Day Number: ");
//        int day = scan.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Not a Day");
//                break;
//        }

        System.out.print("Enter the website: ");
        String website = scan.nextLine();
        String ext = website.substring(website.lastIndexOf(".")+1);
        switch (ext) {
            case "com":
                System.out.println("Commercial");
                break;
            case "gov":
                System.out.println("Government");
                break;
            case "org":
                System.out.println("Organisation");
                break;
            case "net":
                System.out.println("Network");
                break;
        }
    }
}