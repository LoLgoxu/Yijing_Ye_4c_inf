import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.NetworkInterface;
import java.util.List;

/**
 * CONTROLLER: Gestisce l'interazione tra la Vista e il Modello.
 * Inizializza la visualizzazione dell’elenco e imposta il listener sui click, per mostrare
 * i dettagli dell’interfaccia selezionata.
 */
public class NetworkInterfaceController {
    private NetworkInterfaceModel model;
    private NetworkInterfaceView view;

    public NetworkInterfaceController(NetworkInterfaceModel model, NetworkInterfaceView view) {
        this.model = model;
        this.view = view;
        initView();
        initController();
    }

    /**
     * Popola la JTextArea dell'elenco con i nomi e display name delle interfacce.
     */
    private void initView() {
        List<NetworkInterface> interfaces = model.getNetworkInterfaces();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (NetworkInterface ni : interfaces) {
            sb.append(index)
                    .append(": ")
                    .append(ni.getName())
                    .append(" - ")
                    .append(ni.getDisplayName())
                    .append("\n");
            index++;
        }
        view.setInterfaceList(sb.toString());
    }

    /**
     * Aggiunge un listener all’area che elenca le interfacce per gestire il click utente.
     * Al click, viene determinata la linea cliccata e viene chiamato il metodo per mostrare
     * i dettagli dell’interfaccia corrispondente.
     */
    private void initController() {
        view.getInterfaceListTextArea().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int pos = view.getInterfaceListTextArea().viewToModel2D(e.getPoint());
                try {
                    int clickedLine = view.getInterfaceListTextArea().getLineOfOffset(pos);
                    showInterfaceDetails(clickedLine);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    /**
     * Mostra le informazioni dettagliate dell’interfaccia di rete rispondente al numero di linea
     * selezionato.
     */
    private void showInterfaceDetails(int index) {
        List<NetworkInterface> interfaces = model.getNetworkInterfaces();
        if (index >= 0 && index < interfaces.size()) {
            NetworkInterface ni = interfaces.get(index);
            String details = model.getInterfaceDetails(ni);
            view.setDetails(details);
        }
    }
}
