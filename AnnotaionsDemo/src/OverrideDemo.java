class Parent {
    public void display() {
        System.out.println("Hello");
    }
}
class Child extends Parent {
    @Override                   // Gives error if you're not overriding the method (maybe spelling mistake)
    public void display() {
        System.out.println("Hi");
    }
}
public class OverrideDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
