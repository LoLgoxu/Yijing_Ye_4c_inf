public class Main {
    Libro l = new Libro();

    public Main(String titolo, String autore, double costo){
        l.titolo = titolo;
        l.autore = autore;
        l.prezzo = costo;
    }

    public static void main(String[] args) {
        Main l1 = new Main("Bibbia", "Dio", 45.9f);
        l1.l.mostraDettagli();
    }
}
