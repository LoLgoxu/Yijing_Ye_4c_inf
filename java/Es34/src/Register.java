import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {

    private JPanel panel1;
    private JTextField UNJTF;
    String username;
    private JTextField EmailJTF;
    private JPasswordField PSJSF;
    private JLabel PWJLabel;
    private JLabel EmailJLabel;
    private JLabel UNJLabel;
    private JButton InviaJB;
    private JButton ANNULLAButton;

    public Register() {
        InviaJB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(username);
            }
        });
        UNJTF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username = UNJTF.getText();
            }
        });
    }
}
