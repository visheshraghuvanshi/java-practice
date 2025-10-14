interface Member {
    void callback();
}
class Customer implements Member {
    String name;
    Customer (String n) {
        name = n;
    }
    public void callback () {
        System.out.println("Ok, I will visit - " + name);
    }
}
class Store {
    Member[] mem = new Member[100];
    int count = 0;
    void register(Member m) {
        mem[count++] = m;
    }
    void inviteSale() {
        for (int i =0; i <count; i++) {
            mem[i].callback();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}