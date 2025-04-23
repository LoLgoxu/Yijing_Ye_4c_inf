import java.util.ArrayList;
import java.util.Collections;

/**
 * La classe MemoryModel gestisce la generazione e lo stato delle carte.
 */
public class MemoryModel {
    private int rows;
    private int cols;
    private MemoryCard[] cards;

    public MemoryModel(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        generateCards();
    }

    /**
     * Genera le carte: crea coppie di carte (utilizzando un id) e le mescola.
     */
    private void generateCards() {
        int totalCards = rows * cols;
        if (totalCards % 2 != 0) {
            throw new IllegalArgumentException("Il numero totale di carte deve essere pari.");
        }
        cards = new MemoryCard[totalCards];
        int numPairs = totalCards / 2;
        ArrayList<MemoryCard> tempList = new ArrayList<>();
        for (int i = 1; i <= numPairs; i++) {
            // Ogni coppia ha lo stesso id
            tempList.add(new MemoryCard(i));
            tempList.add(new MemoryCard(i));
        }
        Collections.shuffle(tempList);
        cards = tempList.toArray(new MemoryCard[0]);
    }

    /**
     * Ritorna la carta in posizione index.
     */
    public MemoryCard getCard(int index) {
        if (index >= 0 && index < cards.length) {
            return cards[index];
        }
        return null;
    }

    /**
     * Ritorna il numero totale di carte.
     */
    public int getTotalCards() {
        return cards.length;
    }

    /**
     * Controlla se tutte le carte sono state abbinate.
     */
    public boolean allCardsMatched() {
        for (MemoryCard card : cards) {
            if (!card.matched) return false;
        }
        return true;
    }
}
