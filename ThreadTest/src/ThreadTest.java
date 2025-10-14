class Mythread extends Thread {
    public Mythread (String name) {
        super(name);
    }
    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class ThreadTest {

    public static void main(String[] args) {
        Mythread t = new Mythread("My Thread");
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("ID: " + t.getId());
        System.out.println("Name: " + t.getName());
        System.out.println("Priority: " + t.getPriority());
        System.out.println("State: " + t.getState());
        System.out.println("Alive? : " + t.isAlive());
        t.start();
        t.interrupt();
        System.out.println("State: " + t.getState());

    }
}
