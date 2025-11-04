import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows 10");
        p.setProperty("Model", "Latitude");

        System.out.println(p);
        p.store(new FileOutputStream("src/op/MyData.txt"), "Laptop");
        p.storeToXML(new FileOutputStream("src/op/MyData.xml"), "Laptop");

        Properties p2 = new Properties();
        p2.loadFromXML(new FileInputStream("src/op/Person.xml"));
        System.out.println(p2);
        System.out.println(p2.getProperty("Name"));
    }
}
