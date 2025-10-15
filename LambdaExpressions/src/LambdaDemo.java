@FunctionalInterface    // Not Necessary But Using it is a good practice
interface MyLambda {
    public void display();
}

//class My implements MyLambda {
//    public void display() {
//        System.out.println("Hello World");
//    }
//}

public class LambdaDemo {
    public static void main(String[] args) {
//        MyLambda m = new MyLambda() {
//            @Override
//            public void display() {
//                System.out.println("Hello World");
//            } // This is anonymous Inner Class
//        };

        MyLambda m = () -> {System.out.println("Hello World");}; //This is a Lambda Expression
        m.display();
    }
}
