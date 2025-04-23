/**
 * CONTROLLER: Coordina l'interazione tra la Vista e il Modello.
 * - Gestisce l’evento sul bottone "Verifica"
 * - Recupera i dati inseriti, li valida, e utilizza il Modello per ottenere i dettagli
 * - Aggiorna la Vista con i risultati
 */
public class PortScannerController {
    private PortScannerModel model;
    private PortScannerView view;
    private final int TIMEOUT = 2000;  // Timeout in millisecondi per il test della porta

    public PortScannerController(PortScannerModel model, PortScannerView view) {
        this.model = model;
        this.view = view;
        initController();
    }

    private void initController() {
        view.getScanButton().addActionListener(e -> performScan());
    }

    private void performScan() {
        String hostname = view.getHostname();
        String portText = view.getPortText();
        int port;
        // Validazione della porta
        try {
            port = Integer.parseInt(portText);
        } catch (NumberFormatException e) {
            view.setResult("Porta non valida. Inserisci un numero intero.");
            return;
        }

        if (port < 1 || port > 65535) {
            view.setResult("Porta fuori range. Inserisci un numero tra 1 e 65535.");
            return;
        }

        // Ottenimento delle informazioni dal modello
        String result = model.getDetails(hostname, port, TIMEOUT);
        view.setResult(result);
    }
}
