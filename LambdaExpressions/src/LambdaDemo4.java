@FunctionalInterface    // Not Necessary But Using it is a good practice
interface MyLambda4 {
    public void display(String str);
}

public class LambdaDemo4 {

    public LambdaDemo4(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void reverse (String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        MyLambda4 ml = System.out::println;
        ml.display("Hello");
        System.out.println();

        MyLambda4 ml2 = LambdaDemo4::reverse; // For non-static create an object and instead of LambdaDemo4 use obj name
        ml2.display("World");
        System.out.println();

        //Constructor
        MyLambda4 ml3 = LambdaDemo4::new; // new for constructor
        ml3.display("hello world");
    }
}
