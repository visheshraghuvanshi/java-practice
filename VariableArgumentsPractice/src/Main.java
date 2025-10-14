
public class Main {

    static void show (int ...x) {
        for (int a: x) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        show(10,1,20,30);
        show(new int[]{3,7,5,9,11,13,15});
        int[] A = {2,4,6,8,10};
        show(A);
    }
}