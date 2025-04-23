import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.NetworkInterface;
import java.util.Collections;

public class NetworkInterfaceController {
    private NetworkInterfaceModel model;
    private NetworkInterfaceView view;

    public NetworkInterfaceController(NetworkInterfaceModel model, NetworkInterfaceView view) {
        this.model = model;
        this.view = view;

        // Aggiunge il listener al pulsante "Refresh"
        view.getRefreshButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshInterfaceList();
            }
        });

        // Aggiorna la lista all'avvio
        refreshInterfaceList();
    }

    private void refreshInterfaceList() {
        try {
            // Ottiene le interfacce di rete dal Model
            StringBuilder interfaceList = new StringBuilder();
            for (NetworkInterface ni : Collections.list(model.getNetworkInterfaces())) {
                interfaceList.append(ni.getName()).append("\n");
            }

            // Aggiorna la View con la lista delle interfacce
            view.getInterfaceListArea().setText(interfaceList.toString());

            // Mostra i dettagli della prima interfaccia (se presente)
            if (interfaceList.length() > 0) {
                showInterfaceDetails(interfaceList.toString().split("\n")[0]);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Errore durante il caricamento delle interfacce di rete: " + e.getMessage(), "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showInterfaceDetails(String interfaceName) {
        try {
            // Ottiene i dettagli dell'interfaccia dal Model
            NetworkInterface ni = NetworkInterface.getByName(interfaceName);
            if (ni != null) {
                String details = model.getInterfaceDetails(ni);
                view.getDetailsArea().setText(details);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Errore durante il caricamento dei dettagli dell'interfaccia: " + e.getMessage(), "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }
}