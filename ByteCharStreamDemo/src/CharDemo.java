import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharDemo {
    public static void main(String[] args) throws Exception {
        char[] c = {'a','b','c','d','e','f','g','h','i','j'};
        CharArrayReader cr = new CharArrayReader(c);
        int x;
        while((x=cr.read()) != -1) {
            System.out.println((char)x);
        }
        cr.close();

        CharArrayWriter cw = new CharArrayWriter();
        cw.write('a');
        cw.write('b');
        cw.write('c');
        cw.write('d');
        System.out.println(cw); //works
        FileWriter fw = new FileWriter("src/Test2.txt");
        cw.writeTo(fw);
        fw.flush();
        cw.close();
    }
}
