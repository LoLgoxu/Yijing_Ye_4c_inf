public class Ordine {
    String idOrdine;
    double prezzoTot = 0;
    Prodotto[] prodotti = new Prodotto[100];

    void getTot(Prodotto[] prodotti){
        for (int i = 0; i < prodotti.length; i++) {
            prezzoTot = prezzoTot + prodotti[i].prezzoVendita;
        }
    }
}
