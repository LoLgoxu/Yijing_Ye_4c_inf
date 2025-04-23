import javax.swing.*;
import java.awt.*;

/**
 * MemoryGame.java
 *
 * Implementa il gioco Memory in modalità multigiocatore locale.
 * Utilizza Swing per l’interfaccia grafica e fornisce effetti sonori per:
 * - carta scoperta
 * - carta nuovamente coperta
 * - coppia trovata
 * - coppia non trovata
 * - gioco completato
 */
public class MemoryGame extends JFrame {
    private MemoryModel model;
    private MemoryView view;
    private MemoryController controller;

    /**
     * Costruttore principale: imposta la finestra, crea il modello, 
     * la vista e il controller.
     */
    public MemoryGame() {
        // Impostazione della finestra principale
        setTitle("Memory Game - Multigiocatore Locale");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crea il modello: qui definiamo una griglia 4x4 (16 carte, 8 coppie)
        model = new MemoryModel(4, 4);

        // Crea la vista e aggiungila al frame (pannello centrale)
        view = new MemoryView(4, 4);
        add(view, BorderLayout.CENTER);

        // Aggiunge un pannello in alto per mostrare lo status (turno) e i punteggi
        JPanel topPanel = new JPanel(new BorderLayout());
        view.statusLabel = new JLabel("Turno: Giocatore 1");
        view.scoreLabel  = new JLabel("Giocatore 1: 0   Giocatore 2: 0");
        topPanel.add(view.statusLabel, BorderLayout.WEST);
        topPanel.add(view.scoreLabel, BorderLayout.EAST);
        topPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        add(topPanel, BorderLayout.NORTH);

        // Crea il controller, che collega vista e modello e gestisce la logica di gioco
        controller = new MemoryController(model, view);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Main: utilizza SwingUtilities per avviare l'interfaccia grafica sul thread corretto.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MemoryGame());
    }
}
