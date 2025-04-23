package magazzino.gestione;

import magazzino.articoli.Articolo;

public class GestoreMagazzino {
    Articolo articolo = new Articolo("sapone", 0);
    public void aggiungiArticolo(int a) {
        articolo.quantity = articolo.quantity + a;
    }

    public void stampaInventario() {
        System.out.println("inventario:" + articolo.quantity);
    }
}
