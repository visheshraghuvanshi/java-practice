import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileExample {
    public static void main(String[] args) throws Exception {
        try (FileOutputStream fos = new FileOutputStream("src/Test.txt")) {
            String  str = "Learn Java Programming";

            byte[] b = str.getBytes();
            fos.write(b , 6, str.length() -6);
        }

        try (FileInputStream fis = new FileInputStream("src/Test.txt")) {
            byte[] b = new byte[fis.available()]; // gives no of bytes
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
        } //while loop and do while can also be used till it becomes -1

        try (FileWriter fw = new FileWriter("src/Test2.txt")) {
            String  str = "Learn Java Programming";
            fw.write(str);
        }

        try (FileReader fr = new FileReader("src/Test2.txt")) {
            int x;
            while((x = fr.read()) != -1) {
                System.out.print((char)x);
            }
        }

    }
}
