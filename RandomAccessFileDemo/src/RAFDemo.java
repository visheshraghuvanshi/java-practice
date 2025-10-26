import java.io.RandomAccessFile;

public class RAFDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("src/example.txt","rw");

        raf.seek(0);
        raf.writeUTF("Hello, world!");

        raf.seek(0);
        String message = raf.readUTF();
        System.out.println(message);

        raf.close();
    }
}
