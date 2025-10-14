class Cylinder {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }

    public void setRadius(double r) {
        if (radius > 0)
            radius = r;
        else
            radius = 0;
    }
    public void setHeight(double h) {
        if (h > 0)
            height = h;
        else
            height = 0;
    }

    public Cylinder() {
        height = 0;
        radius = 0;
    }

    public Cylinder(double r) {
        height = 1;
        radius = r;
    }

    public Cylinder(double r, double h) {
        height = h;
        radius = r;
    }

}
public class Main {
    public static void main(String[] args) {
        Cylinder cr = new Cylinder();
        cr.setHeight(5);
        System.out.println(cr.getHeight());
    }
}