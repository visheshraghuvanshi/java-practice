import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
//        HashSet<Integer> hs = new HashSet<>(20,0.25f); // 25 percent f 20 is 5 so only 5 elements allowed
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10); // will not be stored

        System.out.println(hs);

    }
}
