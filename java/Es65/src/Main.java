import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {

        // creation of 3 parties for the main thread to partition the timing in 3 part
        final CyclicBarrier gate = new CyclicBarrier(3);

        MyThreadA threadA = new MyThreadA();
        MyThreadB threadB = new MyThreadB();

        threadA.start(); // start the first thread occupies 1 party
        threadB.start(); // start the second thread, the same

        try {
            gate.await(); // and wait one party time to start officially the two at the same time
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println("stopped");
        }
    }
}
