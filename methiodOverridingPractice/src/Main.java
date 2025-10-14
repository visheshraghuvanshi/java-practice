class Super {
    public void display() {
        System.out.println("Super Class Display");
    }
}
class Sub extends Super {
    public void display() {
        System.out.println("Sub Class Display");
    }
}
public class Main {
    public static void main(String[] args) {
    Super sup = new Super();
    sup.display();
    Sub s = new Sub();
    s.display();
    }
}