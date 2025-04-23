/**
 * Represents a thread that performs a continuous task and periodically checks for interruptions.
 */
public class WorkerThread extends Thread {
    /**
     * Executes the core logic of the thread. This method continuously performs a task while
     * periodically checking if the thread has been interrupted.
     */
    @Override
    public void run() {
        //
        try {
            while (!Thread.currentThread().isInterrupted()) { // Check if thread is interrupted
                System.out.println("WorkerThread is running...");
                Thread.sleep(1000); // Simulate some work
            }
        } catch (InterruptedException e) {
            System.out.println("WorkerThread has been interrupted!");
        }
        System.out.println("WorkerThread is stopping...");
    }
}
