import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, .75f, true); // true is access order
//        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5) {
//            protected boolean removeEldestEntry(Map.Entry e) {
//                return size() > 5; // if we want to only limit to 5 elements
//            }
//        };

        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        lhm.put(6,"F");

        lhm.put(9,"I");
        lhm.put(8,"H");
        String s = lhm.get(2);
        s = lhm.get(5);
        s = lhm.get(1);

        lhm.forEach((k,v) -> System.out.print(k + " " + v + ", "));

    }
}
