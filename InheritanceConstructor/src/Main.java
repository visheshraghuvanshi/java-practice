class Parent {
    public Parent() {
        System.out.println("Non Parameterized Parent Constructor");
    }
    public Parent(int x) {
        System.out.println("Parameterized Parent Constructor " + x);
    }
}
class Child extends Parent {
    public Child() {
        System.out.println("Non Parameterized Child Constructor");
    }
    public Child(int x) {
        System.out.println("Parameterized Child Constructor " + x);
    }
    Child (int x, int y) {
        super(x);
        System.out.println("2 Param of Child " + y);
    }
}

public class Main {
    public static void main(String[] args) {
        Child d = new Child(20);
        System.out.println();
        Child c = new Child (10,20);

    }
}