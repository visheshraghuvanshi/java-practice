class Cylinder {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double totalSurfaceArea() {
        return (2 * Math.PI * radius) * (radius + height);
    }

    public double volume() {
        return lidArea() * height;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Cylinder");
        Cylinder c = new Cylinder();
        c.radius = 7;
        c.height = 10;
        System.out.println("Lid Area of Cylinder : " + c.lidArea());
        System.out.println("Total Surface Area of Cylinder : " + c.totalSurfaceArea());
        System.out.println("Volume of Cylinder : " + c.volume());
    }
}