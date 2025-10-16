import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class BufferedDemo {
    public static void main(String[] args) throws Exception {
//        FileInputStream fis = new FileInputStream("src/Test.txt");
//        BufferedInputStream bis = new BufferedInputStream(fis);

        FileReader fis = new FileReader("src/Test.txt");
        BufferedReader bis = new BufferedReader(fis);

//        System.out.println("File isMarkSupported?: " + fis.markSupported());  // false
//        System.out.println("Buffer isMarkSupported?: " + bis.markSupported()); // true
//
//        int x;
//        while ((x = bis.read()) != -1) {
//            System.out.print((char) x);
//        }

        System.out.print((char)bis.read()); // L
        System.out.print((char)bis.read()); // e
        System.out.print((char)bis.read()); // a

        bis.mark(10); // mark set at r

        System.out.print((char)bis.read()); // r
        System.out.print((char)bis.read()); // n

        bis.reset(); // went back to r

        System.out.print((char)bis.read()); // r
        System.out.print((char)bis.read()); // n

        //Same till now for Both Input Stream and Reader

        System.out.println("\n" + bis.readLine());

    }
}
