import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));

        al1.add(10);
        al1.add(0, 5);
        al1.addAll(1,al2);
        al1.add(5, 70);
        al1.set(6, 100);

        ListIterator<Integer> it = al1.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
        System.out.println();
        al1.forEach(n-> System.out.print(n + " "));
        System.out.println();
        al2.forEach(System.out::print);

    }
}
