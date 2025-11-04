import java.util.Arrays;
import java.util.Comparator;

class My implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        if (i1 < i2)
            return 1;
        if (i2 < i1)
            return -1;
        return 0;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,1,3,5,7};
        int[] b = {2,4,6,8,1,3,5,7};

        System.out.println(Arrays.compare(a,b));
        a[0] = 1;
        System.out.println(Arrays.compare(a,b));
        a[0] = 4;
        System.out.println(Arrays.compare(a,b));

        int[] c = Arrays.copyOf(b,4);
        for (int x: c)
            System.out.print(x + " ");
        System.out.println();

        Arrays.fill(c, 10); // entire array will have 10
        for (int x: c)
            System.out.print(x + " ");
        System.out.println();

        Arrays.sort(a);
        for (int x: a)
            System.out.print(x + " ");
        System.out.println();

        System.out.println(Arrays.binarySearch(a, 3));

        Integer[] d = {2,4,6,8,1,3,5,7};

        Arrays.sort(d);
        for (int x: d)
            System.out.print(x + " ");
        System.out.println();

        Arrays.sort(d, new My()); // will reverse
        for (int x: d)
            System.out.print(x + " ");
        System.out.println();
    }
}
