import java.util.Random;

public class EverySecondThread extends Thread{
    Random rand = new Random();

    public void run() {
        while (true) {
            System.out.println(rand.nextInt());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
