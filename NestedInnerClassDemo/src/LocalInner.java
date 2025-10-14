abstract class My {
    abstract public void show();
}
class Outer1 {
    public void display() {
        My m = new My() {
            public void show() {
                System.out.println("Hello");
            }
        };
        m.show();
    }
}
public class LocalInner {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.display();
    }
}
