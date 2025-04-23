public class NumbersThread extends Thread{
    public void run() {
        int i = 0;
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(i);
            ++i;
        }
    }
}
