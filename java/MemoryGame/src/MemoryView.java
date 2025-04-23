import javax.swing.*;
import java.awt.*;

/**
 * MemoryView gestisce l'interfaccia grafica: crea la griglia di carte
 * e contiene etichette per lo status e i punteggi.
 */
public class MemoryView extends JPanel {
    JButton[] cardButtons;
    int rows;
    int cols;
    JLabel statusLabel;
    JLabel scoreLabel;

    public MemoryView(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        setLayout(new GridLayout(rows, cols, 5, 5));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        initializeButtons();
    }

    /**
     * Crea un JButton per ogni carta, memorizzando l'indice tramite client property.
     */
    private void initializeButtons() {
        int totalCards = rows * cols;
        cardButtons = new JButton[totalCards];
        for (int i = 0; i < totalCards; i++) {
            JButton btn = new JButton();
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            btn.setText(""); // inizio: carta coperta (non mostra l'id)
            btn.putClientProperty("cardIndex", i);
            cardButtons[i] = btn;
            add(btn);
        }
    }

    /**
     * Aggiorna l’aspetto del pulsante associato alla carta.
     * Se la carta è scoperta (o abbinata) mostra l’id, altrimenti rimane coperta.
     */
    public void updateCardButton(int index, MemoryCard card) {
        JButton btn = cardButtons[index];
        if (card.faceUp || card.matched) {
            btn.setText(String.valueOf(card.id));
            btn.setEnabled(false);
        } else {
            btn.setText("");
            btn.setEnabled(true);
        }
    }

    /**
     * Aggiorna lo stato (es. Turno o messaggi) nella label di status.
     */
    public void setStatus(String status) {
        if (statusLabel != null) {
            statusLabel.setText(status);
        }
    }

    /**
     * Aggiorna l’area punteggio.
     */
    public void setScores(String scoreText) {
        if (scoreLabel != null) {
            scoreLabel.setText(scoreText);
        }
    }
}