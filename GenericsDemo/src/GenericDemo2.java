class MyArray <T> {
    T[] A = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for(int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}
//class MyArray2<T extends Number> extends MyArray<T> {
//
//}
public class GenericDemo2 {
    static void fun(MyArray<? extends Number> obj) {  // WildCard - we cannot use anything other than ?
        // <? super C> will allow us to use class C as well as super class of C
        obj.display();
    }

    public static void main(String[] args) {
        MyArray<Integer> ma1 = new MyArray<>();

        ma1.append(10);
        ma1.append(20);
        ma1.append(30);

        MyArray<Float> ma2 = new MyArray<>();
        ma2.append(12.5f);
        ma2.append(7.52f);
        ma2.append(22.5f);

        fun(ma1);
        fun(ma2);
    }
}
