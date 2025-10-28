public class GenericMethodDemo {
    static <E> void show (E... list) {
        for (E x: list)
            System.out.println(x);
    }

    public static void main(String[] args) {
        show(new String[]{"hi","go","bye"});
        show(new Integer[]{20,30,40});
    }
}
