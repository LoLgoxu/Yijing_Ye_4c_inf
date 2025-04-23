import javax.swing.*;
import java.awt.*;

/**
 * VIEW: Gestisce l’interfaccia grafica.
 * La finestra contiene due JTextArea: una (non-editabile) per l’elenco delle interfacce
 * e una per visualizzare le informazioni dettagliate.
 */
public class NetworkInterfaceView extends JFrame {
    private JTextArea interfaceListTextArea;
    private JTextArea detailsTextArea;

    public NetworkInterfaceView() {
        setTitle("Network Interfaces");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // JTextArea per l’elenco delle interfacce
        interfaceListTextArea = new JTextArea();
        interfaceListTextArea.setEditable(false);
        interfaceListTextArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane listScrollPane = new JScrollPane(interfaceListTextArea);

        // JTextArea per le informazioni dettagliate
        detailsTextArea = new JTextArea();
        detailsTextArea.setEditable(false);
        detailsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane detailsScrollPane = new JScrollPane(detailsTextArea);

        // Usa JSplitPane per dividere verticalmente le due aree di testo
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, listScrollPane, detailsScrollPane);
        splitPane.setDividerLocation(150);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(splitPane, BorderLayout.CENTER);
    }

    /**
     * Imposta il testo da visualizzare nell’area delle interfacce.
     */
    public void setInterfaceList(String listText) {
        interfaceListTextArea.setText(listText);
    }

    /**
     * Imposta il testo da visualizzare nell’area dei dettagli.
     */
    public void setDetails(String details) {
        detailsTextArea.setText(details);
    }

    /**
     * Ritorna la JTextArea in cui sono elencate le interfacce.
     * Questo serve al controller per aggiungere dei listener.
     */
    public JTextArea getInterfaceListTextArea() {
        return interfaceListTextArea;
    }
}
