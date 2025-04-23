package magazzino.main;

import magazzino.gestione.GestoreMagazzino;

public class Main {
    public static void main(String[] args) {
        GestoreMagazzino g1 = new GestoreMagazzino();
        g1.aggiungiArticolo(5);
        g1.stampaInventario();
    }
}
