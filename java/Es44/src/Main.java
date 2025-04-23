/**
 * The Main class serves as the entry point for the program
 */
public class Main {
    /**
     * Entry point of the program. This method demonstrates the creation and
     * interaction of two threads: one that runs a continuous task ("WorkerThread")
     * and another that interrupts the first thread after a delay ("InterrupterThread").
     *
     * @param args Command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        WorkerThread workerThread = new WorkerThread();

        workerThread.start();

        InterrupterThread interruptThread = new InterrupterThread(workerThread);
        interruptThread.start();

    }
}


