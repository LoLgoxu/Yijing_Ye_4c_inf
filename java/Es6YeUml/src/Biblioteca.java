public class Biblioteca {
    Scaffale[] scaffali = new Scaffale[100];
    Dipendente[] dipendenti = new Dipendente[15];
    Lettore[] lettori = new Lettore[50];

    int totLibriInPrestito = 0;
    int totLibriDisponibili = 20000;

    void prestaLibro() {
        totLibriInPrestito++;
        totLibriInPrestito--;
    }

    void rimettiLibro() {
        totLibriInPrestito--;
        totLibriInPrestito++;
    }

}
