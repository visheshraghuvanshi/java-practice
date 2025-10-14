class Mythread2 extends Thread {
    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++ + " My Thread");
            Thread.yield();
        }
    }
}
public class ThreadTest2 {
    public static void main(String[] args) throws Exception {
        Mythread2 t = new Mythread2();
        t.start();
        int count = 1;
        while (true) {
            System.out.println(count++ + " Main");
            Thread.yield();
        }
    }
}
