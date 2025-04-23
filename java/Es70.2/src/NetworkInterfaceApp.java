/**
 * Classe principale che lancia l’applicazione.
 */
public class NetworkInterfaceApp {
    public static void main(String[] args) {
        // Assicuriamoci di creare l'interfaccia grafica sul thread corretto.
        // Crea il modello, la vista e il controller
        NetworkInterfaceModel model = new NetworkInterfaceModel();
        NetworkInterfaceView view = new NetworkInterfaceView();
        new NetworkInterfaceController(model, view);

        // Rende visibile la finestra
        view.setVisible(true);
    }
}





