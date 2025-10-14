class Car {
    public void start() {
        System.out.println("Car Started");
    }
    public void acclerate() { System.out.println("Car is Acclerated");}
    public void changeGear() {
        System.out.println("Car Gear Changed");
    }
}
class LuxuryCar extends Car {
    public void changeGear() {
        System.out.println("Automatic Gear");
    }
    public void openRoof () {
        System.out.println("Sun Roof is Opened");
    }
}
public class OverridingExample {
    public static void main(String[] args) {
        LuxuryCar c = new LuxuryCar();
        c.acclerate();
        c.changeGear();
        c.openRoof();
    }
}
