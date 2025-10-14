class Super {
    public void meth1() {
        System.out.println("Meth1");
    }
    public void meth2() {
        System.out.println("Meth2");
    }
}
class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Sub Meth2");
    }
    public void meth3 () {
        System.out.println("Meth3");
    }
}
public class Main {
    public static void main(String[] args) {
        Super s = new Super();
        s.meth1();
        s.meth2();
        System.out.println();
        Sub s1 = new Sub();
        s1.meth1();
        s1.meth2();
        s1.meth3();
        System.out.println();
        Super s2 = new Sub();
        s2.meth1();
        s2.meth2(); // o/p of sub class
        // s2.meth3(); Error
    }
}