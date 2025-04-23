// ================== SOUND PLAYER =======================

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * La classe SoundPlayer gestisce la riproduzione dei file audio.
 * Utilizza la classe Clip e AudioSystem per caricare ed eseguire i suoni.
 */
public class SoundPlayer {
    // Definisce i percorsi dei file audio (modifica in base alla tua struttura di risorse)
    public static final String CARD_UNCOVERED   = "/sounds/carta_scoperta.wav";
    public static final String CARD_COVERED     = "/sounds/carta_nuovamente_coperta.wav";
    public static final String PAIR_FOUND       = "/sounds/coppia_trovata.wav";
    public static final String PAIR_NOT_FOUND   = "/sounds/coppia_non_trovata.wav";
    public static final String GAME_COMPLETED   = "/sounds/gioco_completato.wav";

    /**
     * Riproduce il suono specificato.
     */
    public static void playSound(String soundFile) {
        try {
            InputStream audioSrc = SoundPlayer.class.getResourceAsStream(soundFile);
            if (audioSrc == null) {
                System.err.println("File audio non trovato: " + soundFile);
                return;
            }
            // Bufferizza lo stream
            InputStream bufferedIn = new BufferedInputStream(audioSrc);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
