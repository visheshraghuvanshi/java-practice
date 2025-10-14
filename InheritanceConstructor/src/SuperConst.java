class Rectangle {
    int length;
    int breadth;

    Rectangle () {
        length = breadth = 1;
    }
    Rectangle (int l, int b) {
        length = l;
        breadth = b;
    }
}

class Cuboid extends Rectangle {
    int height;
    Cuboid () {
        height = 1;
    }
    Cuboid (int h) {
        height = h;
    }
    Cuboid (int l, int b, int h) {
        super(l,b);
        height = h;
    }
    int volume() {
        return length*breadth*height;
    }
}
class Student {
    void show(Student s) {
        System.out.println("Hello " + s);
    }
    void callShow() {
        show(this); // passes current object
    }
}

public class SuperConst {
    public static void main(String[] args) {
        Cuboid c = new Cuboid();
        System.out.println("Volume of c: " + c.volume());
        Cuboid c2 = new Cuboid(10);
        System.out.println("Volume of c2: " + c2.volume());
        Cuboid c3 = new Cuboid(5,3,10);
        System.out.println("Volume of c3: " + c3.volume());
        Student s = new Student();
        s.callShow();
        Student s2 = new Student();
        s2.callShow();
    }
}
