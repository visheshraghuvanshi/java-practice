class Test {
    public final void show() {
        System.out.println("hello");
    }
}
class Test1 extends Test {
//    public void show() {}
// Error
}
final class Test2 {
    public final void show() {
        System.out.println("hello");
    }
}

//class Test3 extends Test2 {
//    //methods
//}
// Can't do this
public class Main {
    public static void main(String[] args) {
        final int PI = 3;
    }
}