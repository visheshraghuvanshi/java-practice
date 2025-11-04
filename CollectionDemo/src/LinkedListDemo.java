import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<>();

        LinkedList<Integer> al2 = new LinkedList<>(List.of(50,60,70,80,90));

        al1.add(10);
        al1.add(0, 5);
        al1.addAll(1,al2);
        al1.add(5, 70);
        al1.set(6, 100);

        al1.addFirst(3);
        al1.addLast(200);

        System.out.println(al1.peek()); // prints 3
        System.out.println(al1.pop()); // prints 3 and then remove it


        al1.forEach(n -> show(n));
    }
    static void show (int n) {
        System.out.print(n + " ");
    }
}
