@FunctionalInterface
interface MyLambda2 {
    public int add(int x, int y);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        MyLambda2 m = (a,b) -> a+b; // We can use it with or without return statement
        System.out.println(m.add(20,30));
    }
}
