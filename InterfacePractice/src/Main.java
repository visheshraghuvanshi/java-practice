interface Test1 {
    void meth1();
    void meth2();
}
class My implements Test1 {
    public void meth1 () {
        System.out.println("Meth1 of class My");
    }
    public void meth2() {
        System.out.println("Meth2 of class My");
    }
    public void meth3() {
        System.out.println("Meth3 of class My");
    }
}
public class Main {
    public static void main(String[] args) {
        Test1 t = new My();
        t.meth1();
        t.meth2();
    }
}