/**
 * La classe MemoryCard rappresenta una carta del gioco.
 */
public class MemoryCard {
    int id;           // Identificativo della coppia
    boolean faceUp;   // true se la carta è scoperta
    boolean matched;  // true se la carta è già stata abbinata

    public MemoryCard(int id) {
        this.id = id;
        this.faceUp = false;
        this.matched = false;
    }
}
