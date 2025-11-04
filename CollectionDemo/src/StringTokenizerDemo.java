import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) throws IOException {
        String data = "name=Vijay;address=delhi;country=india;dept=cse";

        StringTokenizer stk = new StringTokenizer(data, "=;"); // if Delimiter is \n then no need here but in case of space it is needed
        String s;

        while(stk.hasMoreTokens()) { // or stk.hasMoreElements()
            s = stk.nextToken();
            System.out.println(s);
        }

        FileInputStream fis = new FileInputStream("src/op/Student1.txt");
        byte[] b = new byte[fis.available()];
        fis.read(b);
        String data1 = new String(b);

        StringTokenizer stk1 = new StringTokenizer(data1, "="); // if Delimiter is \n then no need here but in case of space it is needed
        String s1;

        while(stk1.hasMoreElements()) { // or stk.stk.hasMoreTokens()
            s1 = stk1.nextElement().toString();
            System.out.println(s1);
        }

        FileInputStream fis2 = new FileInputStream("src/op/Numbers.txt");
        byte[] b2 = new byte[fis2.available()];
        fis2.read(b2);
        String data2 = new String(b2);

        StringTokenizer stk2 = new StringTokenizer(data2, ",");
        ArrayList<Integer> al = new ArrayList<>();

        while (stk2.hasMoreTokens()) {
            al.add(Integer.valueOf(stk2.nextToken()));
        }

        System.out.println(al);

    }
}
