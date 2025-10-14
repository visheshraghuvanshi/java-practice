class Outer {
    int x = 10;
    class Inner {
        int y = 20;
        public void innerDisplay() {
            System.out.println(x + " " + y);
        }
    }
    public void outerdisplay() {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}
public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerdisplay();

        Outer.Inner i = new Outer().new Inner();
        i.innerDisplay();
    }
}