import java.util.*;
class OldClass {
    public void display() {
        System.out.println("Hello");
    }
    @Deprecated                 // It signals to not use this method because it can be removed in the future, it will give a warning
    public void show() {
        System.out.println("Hi");
    }
}
public class DeprecatedDemo {
    @SuppressWarnings("deprecation") //it removes deprecations warnings
    public static void main(String[] args) {
        OldClass oc = new OldClass();
        oc.show();
    }
}
