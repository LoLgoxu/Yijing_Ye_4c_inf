import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * MODEL: Responsabile dell’accesso e della gestione delle informazioni relative alle interfacce di rete.
 */
public class NetworkInterfaceModel {
    private List<NetworkInterface> networkInterfaces;

    public NetworkInterfaceModel() {
        loadNetworkInterfaces();
    }

    /**
     * Carica tutte le interfacce di rete disponibili.
     */
    private void loadNetworkInterfaces() {
        try {
            Enumeration<NetworkInterface> nis = NetworkInterface.getNetworkInterfaces();
            networkInterfaces = new ArrayList<>();
            while (nis.hasMoreElements()) {
                networkInterfaces.add(nis.nextElement());
            }
        } catch (SocketException e) {
            e.printStackTrace();
            networkInterfaces = new ArrayList<>();
        }
    }

    /**
     * Ritorna la lista delle interfacce.
     */
    public List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * Dato un oggetto NetworkInterface, crea una stringa formattata
     * con informazioni dettagliate (nome, display name, stato, MTU e indirizzi IP).
     */
    public String getInterfaceDetails(NetworkInterface ni) {
        StringBuilder details = new StringBuilder();
        details.append("Nome: ").append(ni.getName()).append("\n");
        details.append("Display Name: ").append(ni.getDisplayName()).append("\n");

        try {
            details.append("Attiva (isUp): ").append(ni.isUp()).append("\n");
            details.append("Loopback: ").append(ni.isLoopback()).append("\n");
            details.append("PointToPoint: ").append(ni.isPointToPoint()).append("\n");
            details.append("Multicast: ").append(ni.supportsMulticast()).append("\n");
        } catch (SocketException e) {
            details.append("Errore nel recuperare lo stato\n");
        }

        try {
            details.append("MTU: ").append(ni.getMTU()).append("\n");
        } catch (SocketException e) {
            details.append("Errore nel recuperare lo stato\n");
        }


        // Recupera gli indirizzi IP associati all'interfaccia
        details.append("Indirizzi IP:\n");
        Enumeration<InetAddress> addresses = ni.getInetAddresses();
        while (addresses.hasMoreElements()) {
            InetAddress addr = addresses.nextElement();
            details.append("  - ").append(addr.getHostAddress()).append("\n");
        }

        return details.toString();
    }
}