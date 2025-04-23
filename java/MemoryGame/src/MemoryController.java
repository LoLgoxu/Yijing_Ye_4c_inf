import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * La classe MemoryController gestisce il flusso di gioco.
 * Gestisce gli eventi di click sulle carte, il controllo dell’abbinamento
 * e l’aggiornamento dei turni e dei punteggi.
 */
public class MemoryController implements ActionListener {
    private MemoryModel model;
    private MemoryView view;
    private int currentPlayer; // 0 per Giocatore 1, 1 per Giocatore 2
    private int[] scores;      // Punteggio per ciascun giocatore
    private int firstSelectedIndex = -1;
    private int secondSelectedIndex = -1;
    private boolean busy = false;  // Impedisce il click durante il timer

    public MemoryController(MemoryModel model, MemoryView view) {
        this.model = model;
        this.view = view;
        currentPlayer = 0;
        scores = new int[2];
        // Aggiunge l’ActionListener a ogni bottone della griglia
        for (JButton btn : view.cardButtons) {
            btn.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Se siamo "busy" (in attesa del timer) non elaboriamo il click
        if (busy) return;

        JButton clickedButton = (JButton) e.getSource();
        int index = (int) clickedButton.getClientProperty("cardIndex");
        MemoryCard card = model.getCard(index);

        // Se la carta è già scoperta o abbinata, ignoriamo l’azione.
        if (card.faceUp || card.matched) return;

        // Scopri la carta e aggiorna la vista
        card.faceUp = true;
        view.updateCardButton(index, card);
        SoundPlayer.playSound(SoundPlayer.CARD_UNCOVERED); // suono: carta scoperta

        if (firstSelectedIndex == -1) {
            // Primo click nel turno
            firstSelectedIndex = index;
        } else {
            // Secondo click nel turno
            secondSelectedIndex = index;
            checkForMatch();
        }
    }

    /**
     * Verifica se le due carte selezionate sono uguali.
     * Se sono una coppia: le segna come abbinate, aggiorna il punteggio
     * e riproduce il suono "coppia trovata".
     * Se non sono una coppia: le copre di nuovo dopo un breve ritardo,
     * riproducendo i suoni "carta nuovamente coperta" e "coppia non trovata"
     * e passando il turno all’altro giocatore.
     */
    private void checkForMatch() {
        MemoryCard firstCard = model.getCard(firstSelectedIndex);
        MemoryCard secondCard = model.getCard(secondSelectedIndex);

        if (firstCard.id == secondCard.id) {
            // Coppia trovata!
            firstCard.matched = true;
            secondCard.matched = true;
            view.updateCardButton(firstSelectedIndex, firstCard);
            view.updateCardButton(secondSelectedIndex, secondCard);
            SoundPlayer.playSound(SoundPlayer.PAIR_FOUND); // suono: coppia trovata
            scores[currentPlayer]++;
            updateScoreStatus();
            resetSelection();

            // Controlla se il gioco è terminato
            if (model.allCardsMatched()) {
                view.setStatus("Gioco completato!");
                SoundPlayer.playSound(SoundPlayer.GAME_COMPLETED); // suono: gioco completato

                // Determina e mostra il vincitore
                String winnerMessage = determineWinner();
                JOptionPane.showMessageDialog(view, winnerMessage, "Fine del Gioco", JOptionPane.INFORMATION_MESSAGE);
            }
            // Il giocatore corrente mantiene il turno in caso di coppia trovata
        } else {
            // Coppia non trovata: utilizza un Timer per mostrare le carte per un breve periodo.
            busy = true;
            Timer timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    firstCard.faceUp  = false;
                    secondCard.faceUp = false;
                    view.updateCardButton(firstSelectedIndex, firstCard);
                    view.updateCardButton(secondSelectedIndex, secondCard);
                    SoundPlayer.playSound(SoundPlayer.CARD_COVERED);    // suono: carta nuovamente coperta
                    SoundPlayer.playSound(SoundPlayer.PAIR_NOT_FOUND);    // suono: coppia non trovata

                    // Cambia turno
                    currentPlayer = (currentPlayer + 1) % 2;
                    view.setStatus("Turno: Giocatore " + (currentPlayer + 1));
                    resetSelection();
                    busy = false;
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }

    /**
     * Aggiorna le label dei punteggi e del turno.
     */
    private void updateScoreStatus() {
        view.setScores("Giocatore 1: " + scores[0] + "   Giocatore 2: " + scores[1]);
        view.setStatus("Turno: Giocatore " + (currentPlayer + 1));
    }

    /**
     * Resetta le selezioni del turno.
     */
    private void resetSelection() {
        firstSelectedIndex = -1;
        secondSelectedIndex = -1;
    }

    /**
     * Determina il vincitore in base al punteggio.
     */
    private String determineWinner() {
        if (scores[0] > scores[1])
            return "Vince Giocatore 1 con " + scores[0] + " coppie!";
        else if (scores[1] > scores[0])
            return "Vince Giocatore 2 con " + scores[1] + " coppie!";
        else
            return "Pareggio! Entrambi hanno " + scores[0] + " coppie.";
    }
}
