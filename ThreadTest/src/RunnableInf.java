public class RunnableInf implements Runnable{
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        RunnableInf t = new RunnableInf();
        Thread th = new Thread(t);
        th.start();
        int i = 1;
        while(true) {
            System.out.println(i + " World");
            i++;
        }
    }
}
