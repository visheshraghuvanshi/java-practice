import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread {
    OutputStream os;
    public Producer (OutputStream o) {
        os = o;
    }

    public void run() {
        int count = 1;
        while (true) {
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer " + count);
                System.out.flush();
                count ++;
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }
}

class Consumer extends Thread {
    InputStream is;
    public Consumer (InputStream s) {
        is = s;
    }

    public void run() {
        int x;
        while (true) {
            try {
                x = is.read();
                System.out.println("Consumer " + x);
                System.out.flush();
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }
}

public class PipedDemo {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos); // pis and pos can be interchanged

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}
