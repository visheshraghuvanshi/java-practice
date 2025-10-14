class Rectangle {
    private double length;
    private double breadth;
    public Rectangle() {
        length = 1;
        breadth = 1;
    }
    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    public Rectangle(double s) {
        length = breadth = s;
    }
    public double area() {
        return length*breadth;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.area());
        Rectangle r1 = new Rectangle(10.20);
        System.out.println(r1.area());
        Rectangle r2 = new Rectangle(10);
        System.out.println(r2.area());
    }
}