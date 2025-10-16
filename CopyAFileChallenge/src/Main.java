// Copy contents from source1.txt to source2.txt
// Everything in source1.txt is in upper case but in source2.txt it should be in lower case
// After that we have to copy contents of source1.txt and source2.txt to destination.txt

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("src/source1.txt")) {
            String str = "JAVA \nTEST FILE\n";
            fw.write(str);
        }

        try(FileReader fr = new FileReader("src/source1.txt");
            FileWriter fw = new FileWriter("src/source2.txt")) {
            int diff = 'A' - 'a';
            int x;
            while((x = fr.read()) != -1) {
                if(x >= 'A' && x <= 'Z') {
                    fw.write(x - diff);
                } else {
                    fw.write(x);
                }
            }
        }

        // Can be done by modifying above code, but I am writing separately

//        try(FileReader fr = new FileReader("src/source1.txt");
//            FileReader fr2 = new FileReader("src/source2.txt");
//            FileWriter fw = new FileWriter("src/destination.txt")) {
//            int x;
//            while((x = fr.read()) != -1) {
//                fw.write(x);
//            }
//            while((x = fr2.read()) != -1) {
//                fw.write(x);
//            }
//        }
//        // Don't read and write twice, it will erase the contents of whatever you did on first pass
        // There is a better Way
        try(FileInputStream fis1 = new FileInputStream("src/source1.txt");
            FileInputStream fis2 = new FileInputStream("src/source2.txt");
            SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
            FileOutputStream fos = new FileOutputStream("src/destination.txt")) {
            int x;
            while((x = sis.read()) != -1) {
                fos.write(x);
            }
        }
    }
}
