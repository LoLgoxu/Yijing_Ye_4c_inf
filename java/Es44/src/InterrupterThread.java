/**
 * Represents a thread that interrupts another target thread after a specified delay.
 * This class extends the {@link Thread} class and is used to demonstrate thread
 * interruption in a multithreaded environment.
 */
public class InterrupterThread extends Thread {
    private Thread targetThread; // Reference to the thread to be interrupted

    /**
     * Constructs an {@code InterrupterThread} with a specified target thread to be interrupted.
     *
     * @param targetThread the thread that will be interrupted when this thread executes its logic
     */
    public InterrupterThread(Thread targetThread) {
        this.targetThread = targetThread; // Pass the thread to interrupt via constructor
    }

    /**
     * Executes the logic of the interrupter thread, which is responsible for interrupting
     * the specified target thread after a predefined delay.
     */
    @Override
    public void run() {
        try {
            Thread.sleep(10000); // Wait for 5 seconds
            System.out.println("InterrupterThread is interrupting the WorkerThread...");
            targetThread.interrupt(); // Interrupt the worker thread
        } catch (InterruptedException e) {
            System.out.println("InterrupterThread was interrupted unexpectedly!");
        }
    }
}

