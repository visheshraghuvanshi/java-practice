import java.io.*;

class Student{
    int rollNo;
    String name;
    String dept;
}

public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src/Student1.txt");
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        s.rollNo = 10;
        s.name = "John";
        s.dept = "CS";

        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();

        FileInputStream fis = new FileInputStream("src/Student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        Student s2 = new Student();
        s2.rollNo = Integer.parseInt(br.readLine());
        s2.name = br.readLine();
        s2.dept = br.readLine();
        System.out.println("Roll No: " + s2.rollNo);
        System.out.println("Name: " + s2.name);
        System.out.println("Department: " + s2.dept);
    }
}
