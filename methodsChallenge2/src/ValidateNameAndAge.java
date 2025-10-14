import java.util.Scanner;
public class ValidateNameAndAge {

    static boolean validate(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')||(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))) {
                return false;
            }
        }
        return true;
    }

    static boolean validate (int age) {
        if (age < 1 || age > 100) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scan.next();
        System.out.print("Enter Age: ");
        int age = scan.nextInt();
        System.out.println("Is Name Valid? : " + validate(name));
        System.out.println("Is Age Valid? : " + validate(age));
    }
}
