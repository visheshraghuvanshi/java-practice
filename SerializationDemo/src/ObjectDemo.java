import java.io.*;

class Student implements Serializable {
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;

    public Student() {}
    public Student(int r, String n, float a, String d) {
        rollNo = r;
        name = n;
        avg = a;
        dept = d;
        Data = 500;
        t = 500;
    }

    public String toString() {
        return "\nStudent Details\n" +
                "\nRoll " + rollNo +
                "\nName " + name +
                "\nAverage " + avg +
                "\nDept " + dept +
                "\nData " + Data +
                "\nTransient " + t +"\n";
    }

}
public class ObjectDemo {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("src/Student2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s = new Student(10,"John",89.9f,"CSE");

        oos.writeObject(s);

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("src/Student2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s1 = (Student) ois.readObject();

        System.out.println(s1.toString());

        ois.close();
        fis.close();
    }
}
