import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NetworkInterfaceModel model = new NetworkInterfaceModel();
            NetworkInterfaceView view = new NetworkInterfaceView();
            new NetworkInterfaceController(model, view);
            view.setVisible(true);
        });
    }
}