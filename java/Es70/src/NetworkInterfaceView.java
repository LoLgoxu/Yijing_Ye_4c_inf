import javax.swing.*;
import java.awt.*;

public class NetworkInterfaceView extends JFrame {
    private JTextArea interfaceListArea;
    private JTextArea detailsArea;
    private JButton refreshButton;

    public NetworkInterfaceView() {
        setTitle("Network Interface Viewer");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Area per la lista delle interfacce
        interfaceListArea = new JTextArea();
        interfaceListArea.setEditable(false);
        JScrollPane listScrollPane = new JScrollPane(interfaceListArea);
        add(listScrollPane, BorderLayout.WEST);

        // Area per i dettagli dell'interfaccia
        detailsArea = new JTextArea();
        detailsArea.setEditable(false);
        JScrollPane detailsScrollPane = new JScrollPane(detailsArea);
        add(detailsScrollPane, BorderLayout.CENTER);

        // Pulsante per aggiornare la lista
        refreshButton = new JButton("Refresh");
        add(refreshButton, BorderLayout.SOUTH);
    }

    public JTextArea getInterfaceListArea() {
        return interfaceListArea;
    }

    public JTextArea getDetailsArea() {
        return detailsArea;
    }

    public JButton getRefreshButton() {
        return refreshButton;
    }
}