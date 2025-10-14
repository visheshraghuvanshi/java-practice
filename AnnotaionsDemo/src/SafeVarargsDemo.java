class My<T> {
    @SafeVarargs
    private void show(T...arg) { //it must be a private method or final
        for(T x:arg)
            System.out.println(x);
    }
}

public class SafeVarargsDemo {
    public static void main(String[] args) {

    }
}
