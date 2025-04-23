public class Libro {
    String titolo;
    String autore;
    int numeroPagine;
    double prezzo;

    public Libro(String titolo, String autore, int numeroPagine, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
        this.prezzo = prezzo;
    }

    void stampaDettagli() {
        System.out.println("titolo:" + titolo + "\nautore:" + autore + "\nnumero pagine:" + numeroPagine + "\nprezzo:" + prezzo + "\n");
    }
}
