import javax.swing.*;
import java.net.*;
import java.io.*;

// MAIN: Avvia l'applicazione e inizializza Model, View e Controller
public class PortScannerApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PortScannerModel model = new PortScannerModel();
            PortScannerView view = new PortScannerView();
            new PortScannerController(model, view);
            view.setVisible(true);
        });
    }
}
