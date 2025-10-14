class Circle {
    public double radius;
    public double area () {
        return Math.PI * radius * radius;
    }
    public double perimeter () {
        return Math.PI * radius * 2;
    }
    public double circumference () {
        return perimeter();
    }
}

class Rectangle {
    public double length;
    public double breadth;
    public double area() {
        return length*breadth;
    }
    public double perimeter () {
        return 2*(length+breadth);
    }
    public boolean isSquare () {
        if ( length == breadth) {
            return true;
        }
        return false;
        // or simply return length==breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 7;
        System.out.println("Area: " + c1.area());
        System.out.println("Perimeter : " + c1.perimeter());
        System.out.println("Circumference : " + c1.circumference());

        Circle c2 = new Circle();
        c2.radius = 14;
        System.out.println("Area: " + c2.area());
        System.out.println("Perimeter : " + c2.perimeter());
        System.out.println("Circumference : " + c2.circumference());

        Rectangle r1 = new Rectangle();
        r1.length = 45;
        r1.breadth = 15;
        System.out.println("Area of Rectangle: " + r1.area());
        System.out.println("Perimeter of Rectangle: " + r1.perimeter());
        System.out.println("Is the Rectangle Square: " + r1.isSquare());
    }
}