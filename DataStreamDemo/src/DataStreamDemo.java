import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Student {
    int rollNo;
    float avg;
    String name;
    String dept;
}

public class DataStreamDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src/Student2.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        Student s = new Student();
        s.rollNo = 10;
        s.avg = 80.5f;
        s.name = "John";
        s.dept = "CSE";

        dos.writeInt(s.rollNo);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);

        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("src/Student2.txt");
        DataInputStream dis = new DataInputStream(fis);

        Student s2 = new Student();

        s2.rollNo = dis.readInt();
        s2.avg = dis.readFloat();
        s2.name = dis.readUTF();
        s2.dept = dis.readUTF();

        System.out.println("Roll No: " + s2.rollNo);
        System.out.println("Average Marks: " + s2.avg);
        System.out.println("Name: " + s2.name);
        System.out.println("Department: " + s2.dept);

        fis.close();
        dis.close();
    }
}
