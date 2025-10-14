class LowBalanceException extends Exception {
    public String toString() {
        return "Balance Should not be less than 5000";
    }
}
public class Main {
    static void fun1() {
        try {
            System.out.println(10/0);  // Unchecked
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    static void fun2() {
        try {
            throw new LowBalanceException();
        } catch(LowBalanceException e) {
            System.out.println(e);
        }
//        fu0
    }
    static void fun3 () {
        fun2();
    }
    public static void main(String[] args) {
        fun3();
    }
}