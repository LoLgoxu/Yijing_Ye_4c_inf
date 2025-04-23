import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * MODEL: Responsabile della logica di rete:
 * - Risolve hostname/IP tramite InetSocketAddress
 * - Tenta di stabilire una connessione TCP alla porta specificata per verificare se è aperta
 */
class PortScannerModel {

    /**
     * Risolve l'hostname o indirizzo IP passato come parametro.
     * Se il parametro è valido, ritorna l'indirizzo IP risolto,
     * altrimenti un messaggio di errore.
     */
    public String resolveHost(String hostname) {
        try {
            // Creazione di un InetSocketAddress (porta 0 in quanto non necessaria per la risoluzione)
            InetSocketAddress socketAddress = new InetSocketAddress(hostname, 0);
            InetAddress inetAddress = socketAddress.getAddress();
            if (inetAddress != null) {
                return inetAddress.getHostAddress();
            } else {
                return "Impossibile risolvere l'hostname/IP";
            }
        } catch (IllegalArgumentException e) {
            return "Hostname/IP non valido";
        }
    }

    /**
     * Verifica se la porta è aperta creando una connessione TCP.
     * Utilizza un timeout (espresso in millisecondi) per evitare blocchi troppo lunghi.
     */
    public boolean isPortOpen(String hostname, int port, int timeout) {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(hostname, port), timeout);
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    /**
     * Ritorna le informazioni dettagliate relative all'hostname/IP e alla porta.
     * Mostra il valore risolto e se la porta risulta aperta (in base al test TCP).
     */
    public String getDetails(String hostname, int port, int timeout) {
        StringBuilder result = new StringBuilder();
        result.append("Hostname/IP inserito: ").append(hostname).append("\n");
        result.append("Porta inserita:      ").append(port).append("\n");

        String resolvedIP = resolveHost(hostname);
        result.append("Indirizzo IP risolto: ").append(resolvedIP).append("\n");

        if (resolvedIP.equals("Impossibile risolvere l'hostname/IP")
                || resolvedIP.equals("Hostname/IP non valido")) {
            result.append("Impossibile procedere con il test della porta.\n");
        } else {
            boolean portOpen = isPortOpen(hostname, port, timeout);
            result.append("Stato della porta ").append(port).append(": ")
                    .append(portOpen ? "APERTA" : "CHIUSA").append("\n");
        }
        return result.toString();
    }
}
