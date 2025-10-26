import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
//        File f = new File("");
//        System.out.println(f.isDirectory());
//        String[] list = f.list();
//        for(String x: list) {
//            System.out.println(x);
//        }

//        File list[] = f.listFiles();
//        for(File x: list) {
//            System.out.print(x.getName() + " ");
//            System.out.println(x.getAbsolutePath());
//        }
//        File f = new File("src/Data.txt");
//        f.setReadable(true);

        try {
            File myFile = new File("src/data.txt");

            // Create new file
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }



            // Display info
            System.out.println("Path: " + myFile.getAbsolutePath());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("Writable: " + myFile.canWrite());
            System.out.println("Size: " + myFile.length() + " bytes");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
