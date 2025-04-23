import javax.swing.*;
import java.awt.*;

/**
 * VIEW: Gestisce l’interfaccia grafica.
 * La finestra contiene:
 * - Un campo di testo per inserire hostname o indirizzo IP
 * - Un campo di testo per inserire la porta
 * - Un bottone per avviare il test
 * - Una TextArea (non modificabile) per visualizzare i risultati
 */
public class PortScannerView extends JFrame {
    private JTextField hostnameField;
    private JTextField portField;
    private JButton scanButton;
    private JTextArea resultArea;

    public PortScannerView() {
        setTitle("Port Scanner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);

        // Creazione dei componenti
        hostnameField = new JTextField(20);
        portField = new JTextField(6);
        scanButton = new JButton("Verifica");
        resultArea = new JTextArea(10, 40);
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

        // Layout per l’input
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Hostname/IP:"));
        inputPanel.add(hostnameField);
        inputPanel.add(new JLabel("Porta:"));
        inputPanel.add(portField);
        inputPanel.add(scanButton);

        // Combinazione dei pannelli in una finestra principale
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        getContentPane().add(mainPanel);
    }

    public String getHostname() {
        return hostnameField.getText().trim();
    }

    public String getPortText() {
        return portField.getText().trim();
    }

    public JButton getScanButton() {
        return scanButton;
    }

    public void setResult(String result) {
        resultArea.setText(result);
    }
}