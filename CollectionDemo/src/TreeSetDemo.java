import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40));

        System.out.println(ts); // 10, 30, 40, 50, 70

        ts.add(25);

        System.out.println(ts); // 10, 25, 30, 40, 50, 70

        System.out.println(ts.ceiling(55)); // 70
        System.out.println(ts.first()); // 10
        System.out.println(ts.floor(55)); // 50
        System.out.println(ts.subSet(25, 50)); // 25, 30, 40
        System.out.println(ts.headSet(25)); // 10
        System.out.println(ts.tailSet(25)); // 25, 30, 40, 50, 70


    }
}
