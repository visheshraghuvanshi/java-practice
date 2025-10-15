@FunctionalInterface
interface MyLambda3 {
    public void display();
}

class UseLambda {
    public void callLambda (MyLambda ml) {
        ml.display();
    }
}

class Demo {
    public void method1() {
        UseLambda ul = new UseLambda();
        ul.callLambda( () -> {System.out.println("Hello");} );
    }
}

//class Demo {
//    int temp = 10;
//
//    public void method1() {
//        int count = 0;
//        MyLambda3 m1 = () -> {
//            System.out.println("Hi" + count);
//            System.out.println("Bye" + (++temp)); //can do this
//        };
//        m1.display();
// //        count++; // Is not final or Effectively finale so we cannot change it
//    }
//}

public class LambdaDemo3 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }
}
