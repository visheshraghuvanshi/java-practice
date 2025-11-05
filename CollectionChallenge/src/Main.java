import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/*
 Problem: Menu Driven Program for Account
 1. Create Account
 2. Delete Account
 3. View Account
 4. View All Accounts
 5. Save Accounts
 6. Exit

 Enter your Choice:
*/

class Account implements Serializable {
    static int nextAccNo = 1000; // Starting account number
    private int accNo;
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.accNo = nextAccNo++;
        this.name = name;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        HashMap<Integer, Account> hm = new HashMap<>();

        File file = new File("src/output/accounts.ser");

        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            hm = (HashMap<Integer, Account>) ois.readObject();
            System.out.println("✅ Loaded Existing accounts from file.");
            scan.nextLine();
        }
        if (!hm.isEmpty()) {
            Account.nextAccNo = hm.keySet().stream().max(Integer::compare).get() + 1;
        }

        while (run) {
            System.out.print("1. Create Account\n2. Delete Account\n3. View Account\n4. View All Accounts\n5. Save Accounts\n6. Exit\n\n");
            System.out.print("Enter your Choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the Name of Account Holder: ");
                    scan.nextLine();
                    String s = scan.nextLine();
                    System.out.print("Enter the balance: ");
                    double d = scan.nextDouble();
                    Account ac = new Account(s, d);
                    hm.put(ac.getAccNo(), ac);

                    System.out.println("✅ Account created: " + ac);
                    scan.nextLine();
                    scan.nextLine();
                }
                case 2 -> {
                    System.out.print("Enter the Account Number to Delete: ");
                    int a = scan.nextInt();
                    if (hm.containsKey(a)) {
                        hm.remove(a);
                    } else {
                        System.out.printf("Account Number %d doesn't exist", a);
                    }

                    scan.nextLine();
                }
                case 3 -> {
                    System.out.print("Enter the Account Number to View Details about that Account: ");
                    int a = scan.nextInt();
                    if (hm.containsKey(a)) {
                        System.out.println(hm.get(a));
                    } else {
                        System.out.println("This Account Doesn't Exist");
                    }
                    scan.nextLine();
                    scan.nextLine();
                }
                case 4 -> {
                    hm.forEach((x,y) -> System.out.println(y));
                    scan.nextLine();
                    scan.nextLine();
                }
                case 5 -> {
                    try (
                            FileOutputStream fos = new FileOutputStream("src/output/accounts.ser");
                            ObjectOutputStream oos = new ObjectOutputStream(fos)
                    ) {
                        oos.writeObject(hm);
                        System.out.println("✅ Accounts serialized successfully to accounts.ser");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    scan.nextLine();
                    scan.nextLine();
                }
                case 6 -> {
                    run = false;
                }
                default -> {
                    break;
                }
            }
        }
    }
}
