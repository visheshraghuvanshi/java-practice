import java.io.*;

class Customer implements Serializable {
    public static int counter = 1;
    String custId;
    String name;
    String phone;

    Customer (String name, String phone) {
        this.custId = String.format("C%04d", counter++);
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\nCustomer ID: " + this.custId +
                "\nName: " + this.name +
                "\nPhone Number: " + this.phone + "\n";
    }
}
public class SerializationChallenge {
    public static void main(String[] args) throws Exception {
        String fileName = "src/customer.ser";

        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Customer[] cr = {
                new Customer("Alpha", "111111"),
                new Customer("Beta","222222"),
                new Customer("Gamma", "333333"),
                new Customer("Delta", "444444"),
                new Customer("Epsilon", "555555"),
                new Customer("Zeta", "666666")
        };

        oos.writeInt(cr.length);

        for(Customer c: cr) {
            oos.writeObject(c);
        }
        System.out.println("Object has been Serialized and saved in " + fileName);

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();

        for (int i = 0; i < length; i++) {
            System.out.println(ois.readObject().toString());
            // You can create another lis and store values in it

        }

        System.out.println(".....\nDeserialization Complete");

        ois.close();
        fis.close();

    }
}
