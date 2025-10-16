import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteDemo {
    public static void main(String[] args) throws Exception {

        byte[] b = {'a','b','c','d','e','f','g','h','i','j'};
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
//        int x;
//        while((x=bais.read()) != -1) {
//            System.out.println((char) x);
//        }
        String str = new String(bais.readAllBytes());
        System.out.println(str);
        System.out.println(bais.markSupported());
        bais.close();

        ByteArrayOutputStream baos = new ByteArrayOutputStream((20));
        baos.write('a');
        baos.write('b');
        baos.write('c');
        baos.write('d');

        byte[] ba = baos.toByteArray();
        for (byte y:ba)
            System.out.println((char)y);

        baos.writeTo(new FileOutputStream("src/Test.txt"));

        baos.close();

    }
}
