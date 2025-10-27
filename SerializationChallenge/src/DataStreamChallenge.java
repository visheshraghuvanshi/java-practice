import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamChallenge {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src/Data.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        float[] list = {1.2f, 3.15f, 10.5f, 2.9f, 6.4f, 3.7f,};

        dos.writeInt(list.length);

        for (float x: list) {
            dos.writeFloat(x);
        }
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("src/Data.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();
        for (int i = 0; i < length; i++) {
            System.out.println("Element " + (i+1) + ": " + dis.readFloat());
        }
        dis.close();
        fis.close();

    }
}
