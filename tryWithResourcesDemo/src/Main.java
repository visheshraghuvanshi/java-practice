import java.io.*;
import java.util.Scanner;
public class Main {
    static FileInputStream fi;

    static void Divide() throws Exception {

        try (FileInputStream fi = new FileInputStream("C:\\Users\\Vishesh Raghuvanshi\\Documents\\IdeaProjects\\tryWithResourcesDemo\\src\\Test.txt"); Scanner scan = new Scanner(fi)) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            System.out.println(a/c);
        }

    }
    public static void main(String[] args) throws Exception{
        try {
            Divide();
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}