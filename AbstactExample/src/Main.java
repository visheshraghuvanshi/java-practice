abstract class Super {
    public Super() {
        System.out.println("Super Constructor");
    }
    public void meth1() {
        System.out.println("Math1 of Super");
    }
    abstract public void meth2();
}
class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Meth2 of Sub");
    }
}
public class Main {
    public static void main(String[] args) {
        Super s = new Sub();
        s.meth2();
    }
}