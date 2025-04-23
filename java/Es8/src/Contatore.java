public class Contatore {
    static int numeroOggetti = 0;

    public Contatore() {
        numeroOggetti = numeroOggetti + 1;
    }

    void getNumeroOggetti() {
        System.out.println("num. oggetti:" + numeroOggetti);
    }
}
