abstract class Shape {
    abstract double perimeter ();
    abstract double area ();
}
class Circle extends Shape {
    double radius;
    void setRadius(int r) {
        radius = r;
    }
    double perimeter () {
        return 2* Math.PI * radius;
    }
    double circumference() {
        return perimeter();
    }
    double area () {
        return Math.PI * radius * radius;
    }

}

class Rectangle extends Shape {
    double length, breadth;
    double area () {
        return length * breadth;
    }
    double perimeter () {
        return 2 * (length + breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(12);
        System.out.println("C perimeter" + c.perimeter());
    }
}