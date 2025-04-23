public class Main {
    public static void main(String[] args) {
        NumbersThread thread = new NumbersThread();
        thread.start();

        try {
            // Attendi 3 secondi prima di interrompere il thread
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrompi il thread
        thread.interrupt();
    }
}
