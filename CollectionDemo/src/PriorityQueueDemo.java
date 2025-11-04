import java.util.Comparator;
import java.util.PriorityQueue;
class MyCom implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return 1; // instead of -1
        }
        if (o2 < o1) {
            return -1;
        }
        return 0;
    }
}
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);

        System.out.println(p.peek());

        p.forEach((x) -> System.out.print(x + " "));
        p.poll();
        System.out.println("\nAfter Deletion");
        p.forEach((x) -> System.out.print(x + " "));
        System.out.print("\n\n");

        // max- Heap
        PriorityQueue<Integer> p2 = new PriorityQueue<>(new MyCom());
        p2.add(20);
        p2.add(10);
        p2.add(30);
        p2.add(5);
        p2.add(15);
        p2.add(3);

        System.out.println(p2.peek());

        p2.forEach((x) -> System.out.print(x + " "));
        p2.poll();
        System.out.println("\nAfter Deletion");
        p2.forEach((x) -> System.out.print(x + " "));
    }
}
