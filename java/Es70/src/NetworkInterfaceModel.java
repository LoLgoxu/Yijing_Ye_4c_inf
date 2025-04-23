import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class NetworkInterfaceModel {
    public Enumeration<NetworkInterface> getNetworkInterfaces() throws SocketException {
        return NetworkInterface.getNetworkInterfaces();
    }

    public String getInterfaceDetails(NetworkInterface ni) throws SocketException {
        StringBuilder details = new StringBuilder();
        details.append("Name: ").append(ni.getName()).append("\n");
        details.append("Display Name: ").append(ni.getDisplayName()).append("\n");
        details.append("MTU: ").append(ni.getMTU()).append("\n");
        details.append("Is Up: ").append(ni.isUp()).append("\n");
        details.append("Is Loopback: ").append(ni.isLoopback()).append("\n");
        details.append("Is Virtual: ").append(ni.isVirtual()).append("\n");
        details.append("Hardware Address: ").append(ni.getHardwareAddress()).append("\n");

        ni.getInetAddresses().asIterator().forEachRemaining(inetAddress ->
                details.append("IP Address: ").append(inetAddress.getHostAddress()).append("\n")
        );

        return details.toString();
    }
}