class Test1 {
    static {
        System.out.println("Block 1");
    }
    static {
        System.out.println("Block2");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main");
        Test1 t = new Test1();
    }
}
