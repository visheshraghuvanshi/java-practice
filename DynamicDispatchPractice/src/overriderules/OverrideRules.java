package overriderules;

class Super {
    public void display(int a) {
        System.out.println("Super Display");
    }
}
class Sub extends Super {
    @Override
    public void display(int x) {
        System.out.println("Sub Display");
    }
}
public class OverrideRules {
    public static void main (String[] args) {

    }
}
